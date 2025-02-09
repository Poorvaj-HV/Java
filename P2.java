import java.lang.Math;

public class P2 {
    public static int trapwater(int barheight[]) {
        int n = barheight.length;
        int trappedWater = 0;
        int lmb[] = new int[n]; //left max boundary
        int rmb[] = new int[n]; //right max boundary
        lmb[0] = barheight[0]; //
        rmb[n-1] = barheight[n-1];

        //Initializing lmb[] & rmb[] 
        for(int i=1; i<n; i++) { 
            //lmb[i] = Math.max(barheight[i], lmb[i-1]) -> esay method
            lmb[i] = barheight[i] > lmb[i-1] ? barheight[i] : lmb[i-1];
            rmb[n-i-1] = barheight[n-i-1] > rmb[n-i] ? barheight[n-i-1] : rmb[n-i];
        }

        //if width of bar > 1 then use (Math.min(lmb[i], rmb[i]) - barheight[i]) * width
        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(lmb[i], rmb[i]) - barheight[i];
            trappedWater += waterLevel;
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int barheight[] = {4, 2, 0, 6, 3, 5};
        System.out.println(trapwater(barheight));
    }
}
