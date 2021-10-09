class Test {
	public static boolean test() {
		int[] nums = new int[]{2,3,5,0,1,8,7,2,3,1,0,9};
		int solution = 9;
		int testNaive = trading_Naive.maxProfit(nums);
		int testOnepass = trading_Onepass.maxProfit(nums);
		return testNaive == solution && testOnepass == solution;
	}
}
