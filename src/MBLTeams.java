//      This class stores and creates all the teams when needed
public class MBLTeams {
    Team JBS = this.getJBS();
    Team CHG = this.getCHG();
    Team KIR = this.getKIR();
    Team OLS = this.getOLS();
    Team WST = this.getWST();
    Team RTN = this.getRTN();
    Team CLS = this.getCLS();
    Team KGC = this.getKGC();
    Team ELM = this.getELM();

    Team KNX = this.getKNX();
    Team LCR = this.getLCR();
    Team RVR = this.getRVR();
    Team OLD = this.getOLD();
    Team DKC = this.getDKC();
    Team RMS = this.getRMS();
    Team SQP = this.getSQP();
    Team QCB = this.getQCB();
    Team GRN = this.getGRN();


    public Team getJBS() {
        Team j = new Team(9, "Jupiter Blue Sox");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[0] = new Pitcher(-18, 7, "B. Flores");
        pitchers[1] = new Pitcher(-16, 1, "D. Robinson");
        pitchers[2] = new Pitcher(-11, -6, "R. Mann");
        pitchers[3] = new Pitcher(14, 0, "E. Roberts");
        Player[] players = new Player[10];
        players[0] = new Player(136, 33, 4, 68, 300, 147, 312, "E. Coleman", 1);
        players[1] = new Player(161, 91, 5, 50, 240, 78, 375, "C. Luna", 1);
        players[2] = new Player(155, 23, 5, 69, 258, 87, 403, "R. Morton", 2);
        players[3] = new Player(175, 79, 5, 62, 287, 91, 301, "J. Jackson", 3);
        players[4] = new Player(158, 37, 5, 59, 223, 92, 426, "C. Whitely", 0);
        players[5] = new Player(187, 51, 2, 22, 240, 89, 409, "M. Rowe", 5);
        players[6] = new Player(177, 92, 2, 16, 271, 109, 333, "B. Roosevelt", 3);
        players[7] = new Player(118,90,6,46,211,79,450, "E. Nelson",5);
        players[8] = new Player(90,1,0,0,343,113,453, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getCHG() {
        Team j = new Team(9, "Cheshire Goats");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[0] = new Pitcher(9, -7, "D. Barnes");
        pitchers[1] = new Pitcher(13, -1, "V. Morgan");
        pitchers[3] = new Pitcher(6, -10, "W. Pratt");
        pitchers[2] = new Pitcher(-11, 5, "K. Davidson");
        Player[] players = new Player[10];
        players[7] = new Player(123, 42, 11, 53, 248, 56, 467, "J. McCormick",9);
        players[5] = new Player(114,85,8,34,249,88,422, "B. Hammond",2);
        players[0] = new Player(191, 96, 1, 12, 264, 54, 382, "J. Taylor", 3);
        players[1] = new Player(160, 34, 7, 28, 219, 130, 422, "R. Campbell", 6);
        players[2] = new Player(196, 89, 15, 37, 201, 136, 326, "H. Tate",4);
        players[3] = new Player(146, 62, 9, 66, 234, 77, 406, "E. Knight", 12);
        players[4] = new Player(121, 79, 0, 70, 203, 93, 434, "K. Collins", 6);
        players[6] = new Player(189, 89, 17, 29, 297, 65, 314, "W. Shultz",1);
        players[8] = new Player(93,1,0,0,286,106,514, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getKIR() {
        Team j = new Team(8, "Kaj Iles Rays");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[2] = new Pitcher(1, -5, "W. Logan");
        pitchers[1] = new Pitcher(-3, 5, "J. Valdez");
        pitchers[0] = new Pitcher(19, 6, "A. Ford");
        pitchers[3] = new Pitcher(-20, -7, "B. Shaw");
        Player[] players = new Player[10];
        players[7] = new Player(162,54,10,37,214,132,391, "J. Vega",9);
        players[0] = new Player(186, 55, 3, 59, 272, 134, 291, "S. Cross", 9);
        players[1] = new Player(152, 96, 14, 60, 201, 73, 404, "J. Rivera",8);
        players[2] = new Player(144, 100, 1, 63, 263, 84, 345, "E. Hernandez",5);
        players[3] = new Player(142, 37, 15, 56, 260, 132, 358, "A. Edwards",4);
        players[4] = new Player(114, 90, 2, 38, 300, 82, 374, "C. Bailey", 10);
        players[5] = new Player(167, 44, 10, 18, 268, 146, 347, "Z. McCoy", 1);
        players[6] = new Player(124, 62, 6, 43, 209, 77, 479, "J. Cooper", 7);
        players[8] = new Player(119,2,0,0,292,90,497, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getOLS() {
        Team j = new Team(3, "Olyssa Marlins");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[3] = new Pitcher(4, -2, "P. Myers");
        pitchers[1] = new Pitcher(5, 5, "A. Logan");
        pitchers[0] = new Pitcher(-1, 0, "E. Larson");
        pitchers[2] = new Pitcher(12, -10, "G. Underwood");
        Player[] players = new Player[10];
        players[4] = new Player(144,61,7,26,278,101,383, "D. Alvarado",11);
        players[5] = new Player(140,58,6,26,280,101,389, "W. Mitchell",11);
        players[0] = new Player(126, 83, 4, 42, 285, 145, 315, "S. Pope", 10);
        players[1] = new Player(180, 77, 4, 68, 230, 99, 342, "C. Price", 10);
        players[3] = new Player(170, 45, 10, 64, 267, 76, 368, "J. Gregory", 7);
        players[6] = new Player(118, 45, 8, 51, 273, 94, 411, "D. Daniel", 2);
        players[2] = new Player(161, 80, 4, 50, 245, 59, 401, "R. Barnes", 6);
        players[7] = new Player(128, 78, 5, 24, 242, 57, 466, "J. Moody", 3);
        players[8] = new Player(101,2,0,0,333,82,482, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getWST() {
        Team j = new Team(6, "West Port Whalers");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[3] = new Pitcher(-18, 9, "L. Weaver");
        pitchers[2] = new Pitcher(20, -3, "H. Becker");
        pitchers[0] = new Pitcher(11,-7,"F. Ward");
        pitchers[1] = new Pitcher(11, 1, "A. Wolfe");
        Player[] players = new Player[10];
        players[0] = new Player(192, 60, 11, 26, 278, 131, 302, "J. Martinez", 7);
        players[2] = new Player(188, 24, 9, 53, 294, 50, 382, "J. Coleman", 12);
        players[3] = new Player(179, 96, 8, 38, 234, 71, 374, "W. Boyd", 0);
        players[4] = new Player(182, 61, 3, 17, 287, 58, 392, "S. Clayton", 8);
        players[5] = new Player(189, 84, 7, 50, 256, 72, 342, "G. Mann", 1);
        players[6] = new Player(135,50,17,51,238,77,432, "L. Perkins",12);
        players[1] = new Player(154, 85, 13, 16, 237, 90, 405, "S. Griffin", 9);
        players[7] = new Player(104, 43, 1, 62, 223, 102, 465, "S. Cortez", 12);
        players[8] = new Player(118,6,0,0,256,96,524, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getRTN() {
        Team j = new Team(3, "Rotnick Pirates");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[2] = new Pitcher(0, -3, "O. Lloyd");
        pitchers[3] = new Pitcher(7, 3, "E. Peterson");
        pitchers[0] = new Pitcher(0, -1, "L. Munoz");
        pitchers[1] = new Pitcher(18,-9,"J. Washington");
        Player[] players = new Player[10];
        players[2] = new Player(183,40,5,67,226,137,342, "C. Rose",6);
        players[0] = new Player(194, 77, 5, 32, 207, 121, 364, "G. Mulins", 11);
        players[1] = new Player(194, 58, 4, 48, 279, 116, 301, "M. Sanchez",8);
        players[5] = new Player(169, 77, 14, 34, 242, 150, 314, "H. Sanders", 10);
        players[3] = new Player(162,34,15,50,234,83,422, "W. Turner",7);
        players[4] = new Player(165, 85, 5, 40, 260, 77, 368, "J. Carter", 1);
        players[6] = new Player(145, 78, 1, 60, 206, 64, 446, "E. Foster", 1);
        players[7] = new Player(186, 25, 2, 25, 236, 116, 410, "N. Woods", 1);
        players[8] = new Player(107,7,0,0,333,66,487, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getCLS() {
        Team j = new Team(3, "Calliston Beavers");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[0] = new Pitcher(10, -5, "D. Crawford");
        pitchers[1] = new Pitcher(17, -1, "M. Cannon");
        pitchers[2] = new Pitcher(7, 7, "P. Cox");
        pitchers[3] = new Pitcher(18,5, "K. Hardy");
        Player[] players = new Player[10];
        players[0] = new Player(171, 70, 10, 35, 270, 100, 344, "M. Goodman", 9);
        players[1] = new Player(158, 97, 3, 70, 241, 131, 300, "L. Weaver", 11);
        players[2] = new Player(102,97,15,34,218,122,412, "E. Cunningham", 10);
        players[7] = new Player(186, 74, 15, 57, 297, 128, 243, "C. Roberts", 9);
        players[3] = new Player(182, 62, 7, 50, 234, 58, 407, "A. Connor", 10);
        players[5] = new Player(200, 71, 15, 16, 261, 80, 357, "D. Jones", 4);
        players[6] = new Player(129, 98, 0, 52, 219, 107, 395, "B. Butler", 6);
        players[4] = new Player(200, 24, 3, 62, 213, 99, 399, "A. Garza", 9);
        players[8] = new Player(108,5,0,2,318,92,475, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getKGC() {
        Team j = new Team(6, "Kaj Go Comets");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[2] = new Pitcher(17, 3, "G. Hopkins");
        pitchers[3] = new Pitcher(4, -5, "D. Higgins");
        pitchers[0] = new Pitcher(10, 6, "D. Foster");
        pitchers[1] = new Pitcher(-6, 1, "D. Weaver");
        Player[] players = new Player[10];
        players[0] = new Player(182, 72, 5, 48, 266, 126, 301, "T. Beck", 4);
        players[4] = new Player(137, 47, 15, 69, 293, 95, 344, "S. Perez", 0);
        players[2] = new Player(189, 99, 5, 60, 201, 150, 296, "S. Schwartz", 0);
        players[1] = new Player(149,87,4,50,226,94,390, "D. Harmon",10);
        players[7] = new Player(141, 39, 14, 56, 210, 99, 441, "P. Adams", 7);
        players[5] = new Player(189,29,4,21,274,98,385, "R. Thomas",3);
        players[6] = new Player(136,102,17,23,274,124,324, "B. Terry",1);
        players[3] = new Player(172, 67, 8, 62, 256, 150, 285, "E. Oliver", 5);
        players[8] = new Player(100,7,0,1,298,52,542, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getELM() {
        Team j = new Team(6, "Elm City Bears");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[0] = new Pitcher(19,-8,"B. Fisher");
        pitchers[1] = new Pitcher(16, 2, "D. Rodriguez");
        pitchers[3] = new Pitcher(-5, 4, "E. Robinson");
        pitchers[2] = new Pitcher(10, 0, "S. Murphy");
        Player[] players = new Player[10];
        players[0] = new Player(181, 90, 13, 24, 231, 140, 321, "P. Morgan",9);
        players[1] = new Player(193, 28, 6, 52, 246, 76, 399, "R. Smith",8);
        players[2] = new Player(186, 90, 14, 67, 210, 134, 299, "L. Nelson",8);
        players[3] = new Player(111, 99, 5, 53, 239, 100, 393, "L. Howard", 3);
        players[4] = new Player(193, 77, 10, 13, 237, 52, 418, "S. Griffin",5);
        players[5] = new Player(138, 62, 15, 20, 237, 112, 416, "J. Morris",11);
        players[7] = new Player(119, 73, 1, 33, 209, 126, 439, "G. Flores",11);
        players[6] = new Player(129,70,14,53,270,100,364, "T. Martin",9);
        players[8] = new Player(93,3,0,0,277,69,558, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getKNX() {
        Team j = new Team(4, "Knoxville Bandits");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[2] = new Pitcher(4,-10, "T. Murphy");
        pitchers[0] = new Pitcher(13, -1, "A. Turner");
        pitchers[3] = new Pitcher(-14, 1, "L. Ross");
        pitchers[1] = new Pitcher(17, 7, "D. Padilla");
        Player[] players = new Player[10];
        players[0] = new Player(189, 78, 15, 29, 270, 111, 308, "A. Lee", 6);
        players[1] = new Player(174, 46, 0, 20, 263, 144, 353, "H. Reed",7);
        players[2] = new Player(181, 47, 3, 57, 276, 133, 303, "H. Rivera", 10);
        players[3] = new Player(192, 31, 8, 61, 265, 64, 379, "P. Ramirez",1);
        players[4] = new Player(178,42,17,19,252,150,342, "J. Alexander",10);
        players[5] = new Player(172, 32, 13, 53, 265, 55, 410, "R. Cummings", 12);
        players[6] = new Player(100, 57, 15, 61, 243, 91, 433, "J. Barnett", 5);
        players[7] = new Player(183, 56, 3, 23, 291, 53, 391, "P. Waters", 12);
        players[8] = new Player(94,7,0,1,298,97,503, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getLCR() {
        Team j = new Team(5, "Louise City Roosters");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[3] = new Pitcher(20,7, "K. Simmons");
        pitchers[2] = new Pitcher(12, 0, "L. Swanson");
        pitchers[0] = new Pitcher(-11,-7, "J. Curry");
        pitchers[1] = new Pitcher(-4, -1, "S. Howard");
        Player[] players = new Player[10];
        players[3] = new Player(164, 52, 12, 64, 288, 148, 272, "C. Green", 6);
        players[5] = new Player(171, 68, 13, 40, 204, 50, 454, "A. Carpenter",10);
        players[7] = new Player(146, 50, 9, 43, 221, 133, 398, "R. Bell", 8);
        players[4] = new Player(135,100,22,33,218,72,420,"R. Lee",5);
        players[2] = new Player(175, 43, 14, 36, 232, 116, 384, "C. Murray", 3);
        players[0] = new Player(194, 46, 0, 58, 201, 139, 362, "L. Bennett", 0);
        players[6] = new Player(158, 24, 2, 65, 200, 138, 413, "M. Brooks", 11);
        players[1] = new Player(184, 88, 6, 16, 232, 59, 415, "B. Torres", 4);
        players[8] = new Player(113,3,0,2,314,63,505, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getRVR() {
        Team j = new Team(8, "River City Red Sox");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[2] = new Pitcher(-15, 3, "J. Roberts");
        pitchers[0] = new Pitcher(10, 4, "C. Allen");
        pitchers[1] = new Pitcher(12, 6, "F. Alexander");
        pitchers[3] = new Pitcher(-2,-10, "B. Morris");
        Player[] players = new Player[10];
        players[2] = new Player(137, 63, 12, 45, 224, 110, 409, "A. Diaz", 10);
        players[0] = new Player(191, 79, 8, 23, 229, 81, 389, "E. Griffin", 4);
        players[3] = new Player(170, 56, 11, 41, 299, 146, 277, "E. Torres", 12);
        players[6] = new Player(100, 30, 13, 68, 250, 145, 394, "B. Brown", 6);
        players[4] = new Player(153, 90, 2, 70, 249, 137, 299, "T. Ramirez",0);
        players[1] = new Player(197, 27, 3, 42, 271, 107, 353, "S. Rogers",6);
        players[5] = new Player(155,47,6,40,209,80,463, "S. Barnes",5);
        players[7] = new Player(124,49,12,38,211,103,463, "A. Thompson",0);
        players[8] = new Player(109,7,0,1,338,58,487, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getOLD() {
        Team j = new Team(3, "Olde City Settlers");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[0] = new Pitcher(16, 2, "L. Johnson");
        pitchers[1] = new Pitcher(2,-8, "D. George");
        pitchers[3] = new Pitcher(-1, -5, "J. Hunter");
        pitchers[2] = new Pitcher(13, -2, "L. Martin");
        Player[] players = new Player[10];
        players[5] = new Player(166,27,9,44,237,145,372, "M. Morris",5);
        players[6] = new Player(147,88,11,9,233,78,434, "L. Lewis",1);
        players[4] = new Player(147, 63, 0, 29, 280, 96, 385, "K. Butler", 9);
        players[3] = new Player(151, 85, 5, 51, 254, 109, 345, "J. James", 8);
        players[1] = new Player(104, 95, 13, 67, 277, 57, 387, "W. Cain", 12);
        players[2] = new Player(148, 42, 7, 56, 284, 140, 323, "C. McCarthy",6);
        players[7] = new Player(151, 99, 6, 27, 229, 50, 438, "J. Phillips", 8);
        players[0] = new Player(119, 71, 12, 49, 215, 126, 408, "M. Bowen", 7);
        players[8] = new Player(93,5,0,3,318,109,472, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getDKC() {
        Team j = new Team(9, "Duke City Metros");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[3] = new Pitcher(16, 2, "S. Moore");
        pitchers[0] = new Pitcher(-2, 10, "J. Flores");
        pitchers[2] = new Pitcher(19,-4,"D. Thomas");
        pitchers[1] = new Pitcher(9,-3, "T. Evans");
        Player[] players = new Player[10];
        players[3] = new Player(179,31,16,50,258,129,337, "B. Allen",10);
        players[2] = new Player(139, 82, 1, 59, 270, 57, 392, "R. Ward", 5);
        players[4] = new Player(160, 41, 8, 67, 203, 134, 387, "S. Simon",1);
        players[6] = new Player(115, 95, 6, 61, 271, 117, 335, "C. Green", 8);
        players[0] = new Player(181, 32, 9, 58, 212, 80, 428, "C. Mitchell",10);
        players[7] = new Player(132, 47, 12, 26, 215, 99, 469, "J. Edwards", 5);
        players[5] = new Player(124,21,13,73,261,140,368, "K. Patterson",7);
        players[1] = new Player(162, 68, 6, 52, 247, 83, 382, "B. White", 3);
        players[8] = new Player(113,2,0,1,292,110,482, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getRMS() {
        Team j = new Team(7, "Ramsey Rattlers");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[3] = new Pitcher(12,-6, "P. Coleman");
        pitchers[0] = new Pitcher(-4, -2, "S. Johnson");
        pitchers[2] = new Pitcher(-14, -5, "T. James");
        pitchers[1] = new Pitcher(-3, -3, "S. Reed");
        Player[] players = new Player[10];
        players[7] = new Player(122,86,14,38,249,135,356, "M. James",4);
        players[0] = new Player(170, 96, 2, 43, 276, 58, 355, "J. Long",9);
        players[1] = new Player(195, 86, 11, 38, 204, 115, 351, "E. Davis", 1);
        players[2] = new Player(153, 75, 12, 65, 202, 109, 384, "C. Young", 11);
        players[3] = new Player(151, 78, 5, 66, 206, 118, 376, "S. Parker", 9);
        players[4] = new Player(153, 67, 14, 47, 288, 58, 373, "R. Gray",12);
        players[5] = new Player(187, 81, 15, 14, 248, 71, 384, "S. Young", 11);
        players[6] = new Player(172, 33, 1, 65, 212, 92, 425, "J. Ruiz", 6);
        players[8] = new Player(99,6,0,0,292,109,494, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getSQP() {
        Team j = new Team(10, "South Quigley Pigeons");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[3] = new Pitcher(-9, -4, "J. Bryant");
        pitchers[0] = new Pitcher(18, 0, "Sean Thompson");
        pitchers[2] = new Pitcher(-12, 3, "B. Cooper");
        pitchers[1] = new Pitcher(11, -1, "T. Moore");
        Player[] players = new Player[10];
        players[4] = new Player(185,75,4,29,226,86,395, "R. Castillo",4);
        players[0] = new Player(171, 47, 7, 47, 280, 119, 329, "B. Clark", 7);
        players[1] = new Player(153, 89, 4, 50, 280, 85, 339, "M. Anderson", 7);
        players[2] = new Player(157, 83, 4, 61, 241, 85, 369, "R. Campbell", 12);
        players[3] = new Player(195, 58, 14, 51, 296, 79, 307, "D. Howell", 12);
        players[5] = new Player(197, 89, 13, 34, 286, 80, 301, "J. Gonzales", 0);
        players[6] = new Player(137, 88, 15, 52, 293, 128, 287, "H. Wright", 4);
        players[7] = new Player(159, 35, 2, 56, 227, 119, 402, "Sam. Thompson", 12);
        players[8] = new Player(90,0,0,3,322,62,523, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getQCB() {
        Team j = new Team(3, "Q City Bankers");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[0] = new Pitcher(12,-2, "G. Henderson");
        pitchers[1] = new Pitcher(0, -7, "J. Pittman");
        pitchers[2] = new Pitcher(-14, -10, "D. Cook");
        pitchers[3] = new Pitcher(-6, -2, "R. Sanchez");
        Player[] players = new Player[10];
        players[4] = new Player(184,53,21,32,269,92,349, "D. Thornton",4);
        players[2] = new Player(170,61,11,66,255,63,374, "J. Ross",3);
        players[6] = new Player(170, 62, 12, 25, 245, 50, 436, "M. Hall", 12);
        players[0] = new Player(186, 72, 12, 60, 213, 139, 318, "G. Powell", 7);
        players[1] = new Player(189, 64, 5, 70, 261, 72, 339, "D. Murphy", 5);
        players[5] = new Player(124, 70, 8, 31, 200, 103, 464, "H. Murphy", 9);
        players[7] = new Player(197, 70, 6, 25, 207, 92, 403, "S. Nelson", 10);
        players[3] = new Player(123, 98, 14, 55, 284, 111, 315, "C. Hill", 8);
        players[8] = new Player(107,5,0,3,287,95,503, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }

    public Team getGRN() {
        Team j = new Team(9, "Greenfield Giants");
        Pitcher[] pitchers = new Pitcher[4];
        pitchers[0] = new Pitcher(19, -9, "J. Garcia");    //GRN
        pitchers[1] = new Pitcher(1, -6, "S. White");
        pitchers[3] = new Pitcher(-4, -6, "R. Bell");
        pitchers[2] = new Pitcher(-2, 7, "T. Taylor");
        Player[] players = new Player[10];
        players[7] = new Player(176,55,2,18,283,96,375, "J. Thomas",0);
        players[4] = new Player(156,54,15,13,300,116,346, "P. Clark",3);
        players[5] = new Player(130,46,6,56,276,145,341, "J. Strickland",2);
        players[0] = new Player(196, 93, 15, 42, 260, 136, 258, "T. Stewart", 8);
        players[1] = new Player(182, 59, 15, 42, 297, 149, 256, "N. Jones", 4);
        players[3] = new Player(131, 62, 7, 42, 297, 122, 339, "E. Reed", 12);
        players[2] = new Player(173, 76, 3, 58, 264, 117, 309, "R. Smith", 5);
        players[6] = new Player(184, 57, 9, 26, 295, 126, 303, "B. Mitchell", 8);
        players[8] = new Player(96,3,0,2,304,116,479, "P", 2);
        for (int i = 0; i < 9; i++) {
            j.addPlayer(players[i], i);
        }
        for (int i = 0; i < 4; i++) {
            j.addPitcher(pitchers[i], i);
        }
        return j;
    }
}