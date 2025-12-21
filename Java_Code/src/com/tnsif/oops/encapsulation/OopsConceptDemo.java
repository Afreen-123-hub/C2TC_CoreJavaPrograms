package com.tnsif.oops.encapsulation;

public class OopsConceptDemo {
          //var declaration /data members
		private int serialNum;       //int,string,boolean,float
		private String name;         //private(accesable within the class),public,protected
		private int age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//getters and setters method(built in method)
		public int getSerialNum() {      //get means get input 
			return serialNum;
		}
		public void setSerialNum(int serialNum) {     //set means place in correct position
			this.serialNum=serialNum;	
			}      //this is a keyword refers to current obj

             @Override
             public String toString() {
            	 return "OopsConceptDemo [Serial number=" +serialNum+"," +"name ="
            	 		+ "" +name+", age=" +age+"]";
             }
             }

