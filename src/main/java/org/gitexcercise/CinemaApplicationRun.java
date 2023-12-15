package org.gitexcercise;

/**
 * Hello world!
 *
 */
public class CinemaApplicationRun
{
    public static void main( String[] args )
    {
        Viewer[] viewers = new Viewer[5];
        viewers[0] = new Viewer("Name0", 20, 5);
        viewers[1] = new Viewer("Name1", 22, 5);
        viewers[2] = new Viewer("Name2", 23, 5);
        viewers[3] = new Viewer("Name3", 24, 5);
        viewers[4] = new Viewer("Name4", 25, 5);
        System.out.println(ViewerStatistics.averageAge(viewers));
    }
}
