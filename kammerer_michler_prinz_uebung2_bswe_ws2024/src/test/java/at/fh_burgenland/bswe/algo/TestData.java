package at.fh_burgenland.bswe.algo;

import lombok.Getter;

public class TestData {
    @Getter
    private static final int searchedNumberPositive = 456;
    @Getter
    private static final int searchedNumberNegative = -121;
    @Getter
    private static final int[] listSortedOnlyPositive = {6,6,7,9,12,14,16,16,19,26,28,32,32,36,41,43,44,44,46,48,48,49,51,53,55,56,58,59,59,59,59,63,69,74,74,75,75,76,78,78,79,82,84,85,86,89,90,91,95,96,97,98,98,100,102,108,111,115,115,115,117,118,118,120,120,122,123,127,130,133,134,134,134,135,135,136,138,138,138,139,140,141,141,141,141,143,145,145,148,151,155,157,157,159,159,162,167,167,169,170,171,171,172,172,177,177,181,182,184,184,185,187,189,191,192,195,195,195,196,198,201,205,208,212,218,218,230,233,234,235,238,244,244,245,245,246,248,248,249,249,250,251,253,254,256,256,257,258,259,263,265,267,267,267,273,277,278,279,281,286,290,293,294,295,300,306,306,310,313,315,318,319,319,323,328,333,336,336,341,341,341,342,354,356,360,360,360,361,362,363,363,368,370,370,372,374,376,376,377,379,381,383,384,387,389,393,393,397,398,402,404,405,407,418,418,419,422,425,427,428,428,432,435,442,446,449,449,449,450,453,454,456,459,459,462,462,467,468,471,474,474,476,479,480,481,481,484,488,490,492,498,508,512,525,527,527,528,529,530,532,535,538,538,541,543,547,547,550,551,559,563,563,566,567,568,570,571,573,574,574,575,579,581,582,583,583,588,592,592,594,594,597,600,604,605,610,610,614,615,615,615,617,617,617,621,621,622,622,623,624,625,625,625,627,630,637,642,645,646,647,647,647,650,652,653,654,654,654,656,659,660,662,665,666,669,678,680,682,682,687,690,696,697,698,701,702,702,702,708,712,715,719,721,722,722,724,724,725,726,727,729,729,730,731,736,737,738,738,741,749,751,753,754,758,758,760,768,768,769,775,778,779,780,781,782,787,787,787,788,792,794,796,797,797,805,810,812,817,817,818,819,821,830,832,832,832,834,835,835,835,836,846,852,853,853,857,858,859,862,864,866,872,874,878,878,879,880,886,887,888,890,890,894,894,894,896,898,898,901,905,905,906,907,909,910,919,919,919,919,920,921,923,923,924,925,926,930,930,931,933,933,935,943,943,944,944,945,946,949,950,955,958,959,961,962,964,965,966,967,970,970,971,972,974,975,975,979,981,982,982,982,987,988,989,992,992,993,998,998,1000};
    @Getter
    private static final int[] listUnsortedOnlyPositive = {234,617,832,170,117,921,141,354,141,48,796,787,257,729,238,859,177,198,387,48,930,120,177,946,719,680,233,145,950,615,926,979,622,592,853,294,812,901,894,78,988,874,715,724,722,579,846,919,769,379,480,218,535,665,754,134,832,456,508,525,85,637,462,256,594,981,662,435,454,84,959,864,935,528,446,253,398,905,955,336,702,189,982,16,212,898,75,115,879,476,768,98,184,245,97,96,622,46,145,187,894,157,610,130,721,90,998,878,570,376,566,627,418,967,943,19,696,532,965,982,931,961,605,647,758,115,100,669,258,975,248,6,474,140,133,896,449,306,654,82,245,547,363,907,44,293,467,172,886,924,690,659,141,647,342,625,195,962,162,313,432,135,155,95,273,79,102,872,972,98,753,181,758,254,372,86,172,574,361,898,731,538,185,246,136,615,656,654,592,368,835,730,196,122,708,653,167,333,323,650,920,315,817,184,267,737,148,157,56,958,249,319,621,538,201,835,919,468,58,906,492,376,712,930,306,49,724,251,295,894,729,74,890,405,615,944,182,617,6,749,923,59,614,449,760,621,32,992,9,278,120,722,617,235,418,250,512,360,834,682,205,471,905,832,419,698,788,910,925,727,751,974,384,16,135,853,563,328,363,474,402,41,646,374,218,389,792,248,687,484,821,356,610,787,370,143,459,625,370,393,982,887,543,192,397,818,12,568,797,277,138,490,588,427,919,878,159,53,141,318,630,993,575,498,383,781,741,530,819,159,44,115,944,830,862,7,858,263,139,428,933,281,14,970,805,265,91,428,778,779,230,134,652,945,310,442,998,488,481,780,836,167,571,244,362,286,787,574,300,407,975,919,341,736,360,880,1000,78,171,782,527,127,69,600,59,108,123,529,966,404,654,89,134,726,51,583,527,702,481,992,866,259,738,249,118,118,59,810,573,970,479,43,279,971,169,26,909,191,563,28,550,541,857,666,319,923,195,797,393,59,360,449,987,171,989,817,450,645,36,567,151,768,890,697,336,597,678,195,341,888,138,581,701,138,559,76,852,964,74,623,738,625,267,702,422,32,208,267,943,459,256,244,775,111,582,682,647,55,835,341,933,794,551,377,642,604,453,594,75,583,949,381,290,660,425,63,624,462,725,547};
    @Getter
    private static final int[] listSortedNegative = {-1000,-995,-993,-990,-985,-983,-980,-974,-969,-960,-951,-943,-940,-937,-923,-923,-913,-909,-908,-900,-899,-885,-879,-874,-871,-865,-865,-845,-842,-841,-835,-821,-819,-815,-814,-812,-812,-812,-793,-781,-780,-778,-778,-776,-772,-770,-769,-769,-755,-754,-748,-740,-733,-730,-729,-726,-720,-719,-719,-718,-710,-708,-706,-704,-696,-695,-693,-688,-680,-679,-669,-669,-665,-663,-661,-651,-650,-650,-634,-628,-613,-597,-594,-592,-590,-585,-574,-574,-570,-568,-568,-568,-547,-545,-543,-539,-535,-530,-527,-524,-519,-516,-515,-515,-506,-487,-487,-486,-478,-472,-471,-466,-463,-461,-454,-449,-443,-439,-438,-438,-434,-431,-430,-425,-424,-418,-409,-407,-404,-396,-392,-383,-380,-380,-375,-367,-358,-357,-356,-355,-355,-354,-351,-349,-342,-342,-337,-324,-321,-319,-317,-316,-312,-308,-307,-303,-301,-299,-298,-297,-292,-279,-278,-273,-271,-271,-271,-271,-269,-265,-263,-258,-256,-256,-252,-244,-242,-231,-229,-229,-228,-227,-224,-224,-214,-210,-204,-199,-197,-187,-183,-182,-180,-179,-178,-174,-174,-162,-161,-153,-146,-145,-145,-141,-141,-139,-138,-135,-133,-121,-120,-120,-119,-114,-106,-99,-99,-98,-98,-81,-77,-76,-75,-70,-70,-67,-64,-61,-59,-52,-49,-43,-38,-36,-34,-32,-23,-23,-17,-13,-13,-9,-6,-4,10,14,17,23,24,27,28,29,33,35,44,54,57,67,77,80,81,91,93,94,95,100,112,113,116,118,121,122,124,125,129,136,136,139,145,146,152,155,156,164,165,172,172,177,184,184,195,198,201,203,203,208,215,215,223,227,229,232,244,245,249,255,256,259,260,261,261,261,261,264,274,283,284,285,294,302,306,309,311,313,314,335,337,338,340,347,347,349,352,356,359,364,372,372,377,378,383,389,395,395,395,396,398,399,407,420,421,431,433,446,449,466,471,472,472,483,484,491,493,494,494,501,512,514,527,529,531,537,550,551,552,553,555,561,577,580,581,587,589,595,595,596,599,601,609,616,618,619,619,622,622,624,627,637,640,647,653,654,660,663,663,663,666,669,671,674,678,679,683,683,693,694,700,704,712,716,722,734,738,740,742,744,747,750,760,761,761,767,770,772,775,776,777,777,780,785,787,791,798,799,808,810,817,818,819,821,821,822,835,840,846,846,862,865,865,866,869,870,872,874,876,877,885,887,897,899,901,903,904,905,907,912,912,913,913,914,916,919,920,924,925,927,937,940,948,955,956,959,963,965,969,978,984,984,987,994};
    @Getter
    private static final int[] listUnsortedNegative = {679, -224, -486, 421, -733, -781, -720, 285, -183, -182, -969, 446, 740, -770, -708, -570, -229, -180, 232, -224, -547, -835, 356, -574, -229, -696, 963, 913, -778, 28, -568, -923, 624, 35, 948, 761, 791, -355, 261, -729, 195, 777, -755, 955, 818, -120, -380, -913, 129, 121, 627, -273, -478, 215, -199, -985, 619, 653, -358, 156, -256, 260, -769, 77, 619, -754, 899, -769, 622, -524, -13, -141, 172, 184, -32, -780, -38, 337, 901, 969, 616, -845, -204, -487, -135, 491, -244, 904, 284, 433, -865, -418, 118, -252, -263, -454, -704, 874, -367, 27, 124, -139, 172, -772, 671, -34, -99, -651, 822, 580, 529, -357, -597, -67, -594, 595, -568, -650, -114, -943, -312, 798, -776, -669, 589, 553, 311, 309, 527, 383, -740, -324, -634, -99, 907, 640, 654, -909, -174, 821, 94, 29, -61, -52, 596, 372, 622, 244, -461, -64, 552, 912, -279, -271, -81, -819, 364, -706, -303, -23, -375, -162, 810, 67, -663, 865, 512, 819, -730, -17, -301, -4, 100, -231, 112, 91, -900, 704, 905, 885, -77, 335, -719, -121, 865, -271, -145, 965, -271, 261, 227, -49, 395, 777, 866, -43, 514, -141, -530, 23, 700, 618, -430, 747, 208, -23, 940, 198, -438, 693, -425, -256, -661, -515, 775, -337, 919, 347, 294, -342, 683, 581, -13, -960, 125, -545, -726, -516, 407, 666, -407, -434, -814, 712, 835, 678, -812, -76, 347, -515, -161, 984, 577, 165, -466, -650, 494, 550, 395, 869, -179, 780, 770, 599, 744, -793, 136, 14, -487, 555, -59, 959, -227, -449, 256, 338, -463, 229, 663, -278, -319, 399, -133, -908, -153, -842, 683, 862, 93, 821, -438, 261, -1000, -354, -993, -865, -669, 449, 245, 601, 669, 215, -146, 113, 716, 122, 846, -98, -471, 587, -695, 146, 846, 767, 274, -292, 551, 808, 10, 466, -718, 80, 609, 738, -174, -990, 203, 44, -841, -404, 372, 840, 264, 395, -680, -228, -543, 987, -693, 787, 927, -613, -265, 734, 306, -983, 887, 772, 994, -592, 776, -812, -574, 377, -665, 903, -317, -307, 722, -187, 785, -995, 164, -424, -443, -98, -9, -214, 314, 359, -383, -899, 925, 389, 302, 259, -519, -351, -568, 155, -269, -885, -585, -197, 54, 872, -874, -316, 870, 201, -342, -392, -778, -75, -138, 913, 637, -210, -36, 761, 494, -879, -974, 223, 139, 924, -590, -298, -70, 249, 340, 817, -321, -821, -356, 984, -980, -396, 674, 914, -535, -815, 203, -119, 912, 81, 57, -299, -145, 595, -349, -439, -871, 24, 760, -937, 283, -178, 501, 956, 647, 877, 152, 17, 799, 396, 184, -539, -431, -923, 483, 33, 431, 349, 420, 261, -70, 694, -710, 177, 978, 561, -812, 537, 750, -380, 663, -688, -106, 313, -506, -355, 472, -271, -409, -628, 937, 663, 352, 95, -719, 916, -951, -527, 484, 742, 136, -308, 398, 876, -940, 255, 660, -472, 145, 531, -120, -297, 493, 378, -679, -6, -258, -242, 897, 920, -748};
}
