package javatraining.assessments.day10;

import java.util.LinkedList;

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

	private static LinkedList<Character> textEditor = new LinkedList<Character>();
	private static char editedChar = ' ';
	private static int editedIndex = 0;

	/**
	 * insert characters at the specified index
	 * @param pos
	 */
	public static void insert(int pos,char ch) {
		System.out.println("\nINSERTION OF ELEMENTS:::::::pos::"+pos+" ch::"+ch);
		textEditor.add(pos, ch ); 
		editedChar = ch;editedIndex = pos;
		System.out.println("CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR::::position:" + pos + ":::" + getText());
	}

	/**
	 * append char at the end
	 * @param ch
	 */
	public static void insert(char ch) {
		System.out.println("\nINSERTION OF ELEMENTS:::::::::");
		if(textEditor.isEmpty()) {
			System.out.println("\nINSERTION OF ELEMENTS::::first:::::");
			editedIndex = 0;
			textEditor.addFirst(ch);
		}else {
			System.out.println("\nINSERTION OF ELEMENTS:::::appended last::::");
			editedIndex = textEditor.size();
			textEditor.addLast(ch);
		}
		editedChar = ch;
		 
		System.out.println("CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR:::::" + getText());
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
		System.out.println("UNDO CHAR::" + editedChar + " undo CHAR PRESENCE flag::"
				 + textEditor.contains(editedChar)+"::Edited index position::"+editedIndex);
		/*
		 * if(textEditor.contains(editedChar)) { Iterator<Character> ite =
		 * textEditor.iterator(); while(ite.hasNext()) {
		 * if(ite.next().equals(editedChar)) { ite.remove(); } } }
		 */		
		textEditor.remove(editedIndex);
		System.out.println("UNDONE SUCCESSFULLY::::::: UPDATED TEXT EDITOR CONTENT::"+getText());
	}

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TextEditor.insert('h');TextEditor.insert('e');
		TextEditor.insert('l');TextEditor.insert('l');
		TextEditor.undo();
		TextEditor.insert('o');
		TextEditor.insert(1,'#');
		TextEditor.undo();
		TextEditor.delete(2);
		TextEditor.edit(2, '@');
	}

}

/**
Ouput:



INSERTION OF ELEMENTS:::::::::
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR:::::h

INSERTION OF ELEMENTS:::::::::
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR:::::he

INSERTION OF ELEMENTS:::::::::
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR:::::hel

INSERTION OF ELEMENTS:::::::::
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR:::::hell

UNDO started:::::::::
UNDO CHAR::l undo CHAR PRESENCE flag::true::Edited index position::3
UNDONE SUCCESSFULLY::::::: UPDATED TEXT EDITOR CONTENT::hel

INSERTION OF ELEMENTS:::::::::
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR:::::helo

INSERTION OF ELEMENTS:::::::pos::1 ch::#
CONTENT ADDED SUCCESSFULLY IN TEXT EDITOR::::position:1:::h#elo

UNDO started:::::::::
UNDO CHAR::# undo CHAR PRESENCE flag::true::Edited index position::1
UNDONE SUCCESSFULLY::::::: UPDATED TEXT EDITOR CONTENT::helo

DELETION OF CHARACTER::::::POS:::2
REMOVED SUCCESSFULLY::UPDATED TEXT EDITOR CONTENT:heo

EDITING CHARACTER AT::::::POS:::2
EDITED SUCCESSFULLY::UPDATED TEXT EDITOR CONTENT:he@




**/

