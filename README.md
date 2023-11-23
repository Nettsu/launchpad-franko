# launchpad-franko

This is a Launchpad Mini 3 Bitwig script made for Franek.

- The clip launching grid is 8x5 and you can scroll it as usual using the arrow buttons
- Below the grid there is a dedicated STOP button for each track
- Further below are two momentary switches used to control the first Track Remote of each track. Holding the lower button sets the Temote Remote to 33%, holding the upper button sets it to 66% and holding both at the same time sets it to 100%. Releasing both buttons resets the Track Remote to 0%.
- Instead of scene launching by default the top 5 buttons of the rightmost column controls 5 Project Remotes, toggling them between 0% and 100%
- The 6th and 7th scene button control the tempo.
- Holding the bottom right corner button (SHIFT in this script) changes the behaviour of some butttons:
  + first 5 scene buttons launch scenes
  + 6th scene button stops all tracks
  + 7th scene button toggles play/stop
  + the Track Remote buttons for track 1-8 work as a toggle instead of a momentary hold

```
 track  track  track  track  track  track  track  track
   1      2      3      4      5      6      7      8
+------+------+------+------+------+------+------+------+------+
|  up  | down | left | rght | sess | drum | keys | user |      |
|      |      |      |      |      |      |      |      |      |
+------+------+------+------+------+------+------+------+------+
|      |      |      |      |      |      |      |      | PR 1 |
|      |      |      |      |      |      |      |      |      |
+------+------+------+------+------+------+------+------+------+
|      |      |      |      |      |      |      |      | PR 2 |
|      |      |      |      |      |      |      |      |      |
+------+------+------+------+------+------+------+------+------+
|      |      |      |      |      |      |      |      | PR 3 |
|      |      |      |      |      |      |      |      |      |
+------+------+--CLIP LAUNCHING GRID 8x5--+------+------+------+
|      |      |      |      |      |      |      |      | PR 4 |
|      |      |      |      |      |      |      |      |      |
+------+------+------+------+------+------+------+------+------+
|      |      |      |      |      |      |      |      | PR 5 |
|      |      |      |      |      |      |      |      |      |
+------+------+------+------+------+------+------+------+------+
| stop | stop | stop | stop | stop | stop | stop | stop | BPM  |
|      |      |      |      |      |      |      |      | +1   |
+------+------+------+------+------+------+------+------+------+
| 66%  | 66%  | 66%  | 66%  | 66%  | 66%  | 66%  | 66%  | BPM  |
| hold | hold | hold | hold | hold | hold | hold | hold | -1   |
+------+------+------+------+------+------+------+------+------+
| 33%  | 33%  | 33%  | 33%  | 33%  | 33%  | 33%  | 33%  | SHFT |
| hold | hold | hold | hold | hold | hold | hold | hold |      |
+------+------+------+------+------+------+------+------+------+
```
