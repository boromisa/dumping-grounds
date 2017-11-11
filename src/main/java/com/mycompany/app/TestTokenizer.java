package com.mycompany.app;

import java.util.StringTokenizer;

public class TestTokenizer {

	public static void main(String[] args) {
		String quotaGroupsFilter = "1,2,3,4,";
		StringTokenizer quotaGroupsTokenizer = new StringTokenizer(quotaGroupsFilter, ",");

		while (quotaGroupsTokenizer.hasMoreTokens()) {
			System.out.println(quotaGroupsTokenizer.nextToken());
		}
	}

}
