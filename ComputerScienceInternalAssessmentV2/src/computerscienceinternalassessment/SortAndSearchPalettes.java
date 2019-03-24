/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceinternalassessment;

import java.util.ArrayList;

/**
 *
 * @author 14914
 */
public class SortAndSearchPalettes {
    
    public void selectionSortOfPalettes(ArrayList<Palette> palettes) {
    for (int i = 0; i < palettes.size(); i++) {
        int minIndex = i;      // Assumed index of smallest remaining value.
        for (int j = i+1; j < palettes.size(); j++) {
            if (palettes.get(j).getPaletteName().compareTo(palettes.get(minIndex).getPaletteName()) < 1  ) {
                minIndex = j;  // Remember index of new minimum
            }
        }
        if (minIndex != i) { 
            //Exchange current element with smallest remaining.
			 //But note that this only happens once each outer loop iteration, at the end of the inner loop's looping
            Palette temp = palettes.get(i);
            palettes.set(i, palettes.get(minIndex));
            palettes.set(minIndex, temp);
        }
    }
}
    
}
