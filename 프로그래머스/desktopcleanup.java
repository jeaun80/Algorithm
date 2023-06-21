public class desktopcleanup {
    public static void main(String[]args){


        String[] wallpaper ={".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};

        int len = wallpaper[0].length();
        int minI = Integer.MAX_VALUE;
        int minJ = Integer.MAX_VALUE;
        int maxI = Integer.MIN_VALUE;
        int maxJ = Integer.MIN_VALUE;
        for(int i=0;i<wallpaper.length;i++){
            String[] s = wallpaper[i].split("");
            for(int j=0;j<len;j++){
                if(s[j].equals("#")){

                    minI = Math.min(minI, i);
                    minJ = Math.min(minJ, j);
                    maxI = Math.max(maxI, i);
                    maxJ = Math.max(maxJ, j);
                }
            }
        }
        System.out.println("MaxI : " + maxI+" MaxJ : "+maxJ+" minI : "+minI+" minJ : "+minJ);
        int[]result = {minI,minJ,maxI+1,maxJ+1};
    }
}
