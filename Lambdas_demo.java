package lambdas_and_streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Lambdas_demo
{
	public static void main(String args[])
	{
		//3 letter string starting with a
		List<String> strList=Arrays.asList("abc", "bcd", "defg","add","eye");
		List<String> filtered=strList.stream()
				.filter(x -> x.startsWith("a"))
				.filter(x -> x.length() == 3)
				.collect(Collectors.toList());
		System.out.printf("String starting with 'a' having 3 character is %s ",filtered);		
		
		//Average
		List<Integer> list=Arrays.asList(10,20,30,50,100,70);
		IntSummaryStatistics Stats=list.stream()
				.mapToInt((a)->a)
				.summaryStatistics();
		System.out.println();
		System.out.println("Average of a List ="+Stats.getAverage());
		
		//palindrome string
		strList=pal(strList);
		for(String q:strList)
		{
			System.out.println(q);
		}
}
static List<String> pal(List<String> strList)
{
	List<String> l2=new ArrayList<String>();
	for(String q:strList)
	{
		String p=q.replaceAll("\\s+","").toLowerCase();
		if(IntStream.range(0,p.length()/2).noneMatch(j -> p.charAt(j)!=p.charAt(p.length()-j-1)))
            l2.add(q);
            }
	return l2;
	}
	}
