import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> result = new ArrayList<>();
		Map<Integer, List<Integer>> map = new HashMap<>();
		int n = groupSizes.length;
		for (int i = 0; i < n; i++) {
			int current = groupSizes[i];
			List<Integer> temp = new ArrayList<>();
			if (map.containsKey(current)) {
				temp = map.get(current);
				System.out.println(temp);
				System.out.println("---");
			}
			temp.add(i);
			System.out.println(temp);
			System.out.println("----------");
			map.put(current, temp);
			if (temp.size() == current) {
				result.add(temp);
				map.remove(current);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = { 3, 3, 3, 3, 3, 1, 3 };
		System.out.println(groupThePeople(intArray));
		System.out.println("*************");
		int[] intArray1 = { 2,1,3,3,3,2};
		System.out.println(groupThePeople(intArray1));
	}

}
