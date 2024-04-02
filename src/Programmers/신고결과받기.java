package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 신고결과받기 {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(Arrays.toString(solution(id_list, report, k)));
	}
		
    public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		HashMap<String, HashSet<String>> reporterInfoMap = new HashMap<>();
		HashMap<String, Integer> reportedCountInfoMap = new HashMap<>();
		HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

		for (String reportInfo : reportSet) {
		    String reporter = reportInfo.split(" ")[0]; // 신고 한 사람
		    String reported = reportInfo.split(" ")[1]; // 신고 당한 사람
		    reporterInfoMap.putIfAbsent(reporter, new HashSet<>());
		    reporterInfoMap.get(reporter).add(reported);
		    reportedCountInfoMap.put(reported, reportedCountInfoMap.getOrDefault(reported, 0) + 1);
		}

		for (String reported : reportedCountInfoMap.keySet()) {
			int reportedCount = reportedCountInfoMap.get(reported);
			if (reportedCount >= k) {
				// 메일 발송 대상
				for (int i = 0; i < id_list.length; i++) {
					if (reporterInfoMap.containsKey(id_list[i]) && reporterInfoMap.get(id_list[i]).contains(reported)) {
						answer[i]++;
					}
				}
			}
		}
		return answer;
	}
    
    //다른사람 풀이 1
//    public static int[] solution(String[] id_list, String[] report, int k) {
//        int[] answer = new int[id_list.length];
//        Map<String, Integer> idIndex = new HashMap<>();
//        Map<String, List<String>> reportMap = new HashMap<>();
//
//        for (int i = 0; i < id_list.length; i++) {
//            idIndex.put(id_list[i], i);
//            reportMap.put(id_list[i], new ArrayList<>());
//        }
//
//        for (String reported : report) {
//            String[] temp = reported.split(" ");
//            if (!reportMap.get(temp[1]).contains(temp[0])) {
//                reportMap.get(temp[1]).add(temp[0]);
//            }
//        }
//
//        for (String id : reportMap.keySet()) {
//            if (k <= reportMap.get(id).size()) {
//                for (String reporter : reportMap.get(id)) {
//                    answer[idIndex.get(reporter)]++;
//                }
//            }
//        }
//
//        return answer;
//    }
    
    //다른사람 풀이 2
//    public static int[] solution(String[] id_list, String[] report, int k) {
//        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
//        HashMap<String, Integer> count = new HashMap<>();
//        for (String s : list) {
//            String target = s.split(" ")[1];
//            count.put(target, count.getOrDefault(target, 0) + 1);
//        }
//
//        return Arrays.stream(id_list).map(_user -> {
//            final String user = _user;
//            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
//            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
//        }).mapToInt(Long::intValue).toArray();
//    }

}
