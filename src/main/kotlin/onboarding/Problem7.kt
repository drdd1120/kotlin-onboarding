package onboarding

/*
1. friends 배열을 바탕으로 관계를 hashmap으로 만들어준다.
2. 함께 아는 친구의 수에 따라 점수를 계산한다.
3. 타임 라인에 방문한 횟수에 따라 점수를 계산한다.
4. 점수를 내림차순 정렬하고 최대 5명을 리턴한다.
 */

fun solution7(
    user: String,
    friends: List<List<String>>,
    visitors: List<String>
): List<String> {
    val hm = makeRelations(friends)
}

private fun makeRelations(friends: List<List<String>>): HashMap<String, ArrayList<String>> {
    val hm = HashMap<String, ArrayList<String>>()
    for (i in friends.indices) {
        val list1 = hm.getOrDefault(friends[i][0], arrayListOf())
        val list2 = hm.getOrDefault(friends[i][1], arrayListOf())
        list1.add(friends[i][1])
        list2.add(friends[i][0])
        hm[friends[i][0]] = list1
        hm[friends[i][1]] = list2
    }
    return hm
}
