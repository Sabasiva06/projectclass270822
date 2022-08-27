package org.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.devtools.idealized.OpaqueKey;

public class BaseClass {

	public static void main(String[] args) {

		String s = "st atic me";

		char[] c = s.toCharArray();

		char[] output = new char[c.length];

		for (int i = 0; i < c.length; i++) {

			if (c[i] == ' ') {
				output[i] = ' ';
			}
		}

		int j = output.length - 1;

		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {

				if (output[j] == ' ') {
					j--;
				}
				output[j] = c[i];
				j--;
			}
		}
		System.out.println(String.valueOf(output));

	}

}
