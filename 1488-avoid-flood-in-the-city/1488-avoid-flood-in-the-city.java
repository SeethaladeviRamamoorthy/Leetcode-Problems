class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> lastRain = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1; // placeholder, any valid lake
            } else {
                int lake = rains[i];
                ans[i] = -1;

                if (lastRain.containsKey(lake)) {
                    int lastDay = lastRain.get(lake);
                    // find the next dry day after lastDay
                    Integer dryDay = dryDays.higher(lastDay);
                    if (dryDay == null) {
                        // no available dry day → flood
                        return new int[0];
                    }
                    ans[dryDay] = lake; // dry this lake on dryDay
                    dryDays.remove(dryDay);
                }
                lastRain.put(lake, i); // mark lake as filled
            }
        }

        return ans;
    }
}
