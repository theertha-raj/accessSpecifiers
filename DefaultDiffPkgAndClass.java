package acessSpecifiers;

import accessModifiersAndEncapsulation.DefaultSameClassDiffClsSamepkg;

public class DefaultDiffPkgAndClass {
	// Does not work bcz default cannot be accessed in other package
	public static void main(String[] args) {
		DefaultDiffPkgAndClass objj = new DefaultDiffPkgAndClass();
		System.out.println(objj);
	}
}
