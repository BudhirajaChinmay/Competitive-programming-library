package strings;

import java.util.Arrays;

public class Z_Algorithm {

	static int[] zAlgo(String s)
	{
		int n = s.length();
		int[] z = new int[n];
		for(int i = 1, l = 0, r = 0; i < n; ++i)
		{
			if(i <= r)
				z[i] = Math.min(r - i + 1, z[i - l]);
			while(i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i]))
				++z[i];
			if(i + z[i] - 1 > r)
			{
				l = i;
				r = l + z[l] - 1;
			}
		}
		
		return z;
	}
	
	static int[] Z(String s) {
		int n = s.length();
		int z[] = new int[n];
		for (int i = 1, l = 0, r = 0; i < n; i++) {
			if (i <= r)
				z[i] = Math.min(r - i + 1, z[i - l]);
			while (i + z[i] < n && s.charAt(z[i]) == s.charAt(i + z[i]))
				z[i]++;
			if (i + z[i] - 1 > r) {
				l = i;
				r = i + z[i] - 1;
			}
		}
		return z;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(Arrays.toString(zAlgo("ababababa")));
	}
}