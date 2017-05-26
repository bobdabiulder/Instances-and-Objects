package com.kindust.karsey.classproj;

/*   This file is part of Instances and Objects.

    This file is part of Instances and Objects. is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This file is part of Instances and Objects. is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with    This file is part of Instances and Objects..  If not, see <http://www.gnu.org/licenses/>.

 */

public class Person {

	private String haircolor,eyecolor,height,weight;
	private int age;
	
	public Person() {
		
	}
	
	public void setHair(String haircolor){
		this.haircolor = haircolor;
	}
	public String getHair(){
		return haircolor;
	}
	//
	public void setEye(String eyecolor){
		this.eyecolor = eyecolor;
	}
	public String getEye(){
		return eyecolor;
	}
	//
	public void setHeight(String height){
		this.height = height;
	}
	public String getHeight(){
		return height;
	}
	//
	public void setWeight(String weight){
		this.weight = weight;
	}
	public String getWeight(){
		return weight;
	}
	//
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

}
