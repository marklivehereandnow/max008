/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.max.demo;

import com.livehereandnow.ages.components.PlayerTable;

/**
 *
 * @author mark
 */
public class TestPlayerTable {

    public static void main(String[] args) {
        PlayerTable pt1 = new PlayerTable();
        PlayerTable pt2 = new PlayerTable();
        System.out.println("new game");
        pt1.show("pt1");
        pt2.show("pt2");

        System.out.println("init 農場");

        //pt1.getCard(3, 0).getBluePoints().setPoints(2);
        pt1.add黃點(1, 0, 1);
        pt1.show("pt1, some setting");
        pt2.show("pt2, do nothing yet");
    }
}
