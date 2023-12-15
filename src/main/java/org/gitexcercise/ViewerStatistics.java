package org.gitexcercise;

public class ViewerStatistics {

    public static double averageAge(Viewer[] viewers) {
        int totalAges = 0;
        for (Viewer viewer : viewers) totalAges += viewer.getAge();
        return (double) totalAges / (double) viewers.length;
    }

}
