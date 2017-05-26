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

public class Main {

	static Person p;
	
	public static void main(String[] args) {
		p = new Person();
		p.setAge(5);
		p.setEye("Blue");
		p.setHair("Blond");
		p.setHeight("5'8\"");
		p.setWeight("1000000");
		System.out.println("Age: " + p.getAge() + "\nEye color: " + p.getEye() + "\nHair color: " + p.getHair() + "\nHeight: " + p.getHeight() + "\nWeight: " + p.getWeight());
	}

}
