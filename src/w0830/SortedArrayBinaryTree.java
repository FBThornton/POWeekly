package w0830;

import java.util.Arrays;

public class SortedArrayBinaryTree {
	
	public class Node {
		int value;
		Node left;
		Node right;
		
		public Node() {
		}
		
		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
		
		public Node(int value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		public Node arrayToTree(int[] arr) {
			int middle = arr.length / 2;
			if(middle == 0) {
				return new Node(arr[middle]);
			} else {
				return new Node(arr[middle], arrayToTree(Arrays.copyOfRange(arr, 0, middle - 1)), arrayToTree(Arrays.copyOfRange(arr, middle + 1, arr.length)));
			}
		}
	}
}
