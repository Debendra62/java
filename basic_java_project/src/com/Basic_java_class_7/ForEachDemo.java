package com.Basic_java_class_7;

import java.util.ArrayList;
import java.util.List;
public class ForEachDemo {

		public static void main(String[] args) {
			List<String> slist=new ArrayList<String>();
			slist.add("Texas");
			slist.add("International");
			slist.add("College");
			
			for(String data: slist) {
				System.out.println(data);
			}
			
		}

	}

