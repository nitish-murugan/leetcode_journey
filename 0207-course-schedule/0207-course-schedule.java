class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> pre = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            pre.add(new ArrayList<>());

        for (int[] p : prerequisites)
            pre.get(p[0]).add(p[1]);

        Set<Integer> done = new HashSet<>();

        // Initially add courses with no prerequisites
        for (int i = 0; i < numCourses; i++)
            if (pre.get(i).isEmpty())
                done.add(i);

        if (done.isEmpty()) return false;

        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < numCourses; i++) {
                if (done.contains(i)) continue;

                if (allPrereqDone(pre.get(i), done)) {
                    done.add(i);
                    changed = true;
                }
            }
        }

        return done.size() == numCourses;
    }

    private boolean allPrereqDone(List<Integer> list, Set<Integer> done) {
        for (int x : list)
            if (!done.contains(x))
                return false;
        return true;
    }
}
