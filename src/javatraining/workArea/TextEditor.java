package javatraining.workArea;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Assignment 3: Building a Text Editor Create a simple text editor that allows
 * users to insert, delete, and edit characters within a text.
 * Use a LinkedList to represent the text content. 
 * Implement methods for inserting characters at
 * specific positions, deleting characters, and undoing changes.
 * 
 * @author ramya
 *
 */
public class TextEditor {

	private static LinkedList<Character> textEditor = null;
	private static Scanner in = new Scanner(System.in);
	private static String editedString = null;

	/**
	 * insert
	 * @param pos
	 */
	public static void insert(int pos) {
		System.out.println("\nINSERTION OF ELEMENTS:::::::::");
		String str = "";
		char[] chArr = null;
		if (null == textEditor)
			textEditor = new LinkedList<Character>();
		if (pos == 0) {
			System.out.println("\nEnter the text::::::");
			while (!str.equals("$$")) {
				str = in.next();
				chArr = str.toCharArray();
				for (char ch : chArr) {
					if (!str.equals("$$"))
						textEditor.add(ch);
				}
			}
		} else {
			int len = textEditor.size();
			System.out.println("\nInsert the text at position:" + pos + ":::::");
			int posNew = pos - 1;
			str = in.next();
			editedString = str;
			chArr = str.toCharArray();
			List<Character> mainList = null;
			if (pos < len) {
				//textEditor.subList(0, posNew); explicitly implemented mod functionality to keep track of any changes in data structure - throws concurrent modification exception when data structure changed 
				// concurrent exception also been thrown when iterator used on the list and updating list after that by add/remove 
				// so to add/remove functions => use iterator obj like iterator.remove() instead of using list.remove() or list.add() in iteration or for-each loop to avoid concurrent modification exception 
				mainList = getSubList(0, posNew);
				for (char ch : chArr) {
					mainList.add(ch);
				}
				mainList.addAll(getSubList(posNew, len));
			} else if (pos > len) {
				mainList = getSubList(0, len);
				mainList = addBlankValue(mainList, len, pos - 1);
				for (char ch : chArr) {
					mainList.add(ch);
				}
			}
			textEditor.clear();
			textEditor.addAll(mainList);
		}
		System.out.println("CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR::::position:" + pos + ":::" + getText());
	}

	/**
	 * getSubList
	 * @param start
	 * @param end
	 * @return
	 */
	private static List<Character> getSubList(int start, int end) {
		List<Character> subElementsList = new LinkedList<Character>();
		for (int index = start; index < end; index++) {
			subElementsList.add(textEditor.get(index));
		}
		return subElementsList;
	}

	/**
	 * addBlankValue
	 * @param elementList
	 * @param start
	 * @param end
	 * @return
	 */
	private static List<Character> addBlankValue(List<Character> elementList, int start, int end) {
		for (int index = start; index < end; index++) {
			elementList.add(' ');
		}
		return elementList;
	}

	/**
	 * delete
	 * @param pos
	 */
	public static void delete(int pos) {
			System.out.println("\nDELETION OF CHARACTER::::::POS:::"+pos);
			textEditor.remove(pos);
			System.out.println("REMOVED SUCCESSFULLY::UPDATED TEXT EDITOR CONTENT:"+getText());
	}

	/**
	 * edit
	 * @param pos
	 * @param ch
	 */
	public static void edit(int pos, char ch) {
		System.out.println("\nEDITING CHARACTER AT::::::POS:::"+pos);
		textEditor.set(pos, ch);
		System.out.println("EDITED SUCCESSFULLY::UPDATED TEXT EDITOR CONTENT:"+getText());
	}

	/**
	 * getText
	 * @return
	 */
	public static String getText() {
		String str = "";
		for(char ch: textEditor) {
			str = str + ch;
		}
		return str;
	}

	/**
	 * undo
	 */
	public static void undo() {
		System.out.println("\nUNDO started:::::::::");
		String str = getText();
		System.out.println("UNDO STRING::" + editedString + " undo STRING PRESENCE flag::" + str.contains(editedString));
		if(str.contains(editedString)) {
			str = str.replaceAll(editedString, "");
		}
		//System.out.println("\n str after undo::"+str);
		char[] chArr = str.toCharArray();
		textEditor.clear();
		for(char ch: chArr) {
			textEditor.add(ch);
		}
		System.out.println("UNDONE SUCCESSFULLY::::::: UPDATED TEXT EDITOR CONTENT::"+getText());
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TextEditor.insert(0);
		TextEditor.insert(3);
		TextEditor.undo();
		TextEditor.delete(5);
		TextEditor.edit(5, '@');
	}

}

/**
Ouput:

INSERTION OF ELEMENTS:::::::::

Enter the text::::::
hihowareyou
$$
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR::::position:0:::hihowareyou

INSERTION OF ELEMENTS:::::::::

Insert the text at position:3:::::
hello
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR::::position:3:::hihellohowareyou

UNDO started:::::::::
UNDO STRING::hello undo STRING PRESENCE flag::true
UNDONE SUCCESSFULLY::::::: UPDATED TEXT EDITOR CONTENT::hihowareyou

DELETION OF CHARACTER::::::POS:::5
REMOVED SUCCESSFULLY::UPDATED TEXT EDITOR CONTENT:hihowreyou

EDITING CHARACTER AT::::::POS:::5
EDITED SUCCESSFULLY::UPDATED TEXT EDITOR CONTENT:hihow@eyou


**/

