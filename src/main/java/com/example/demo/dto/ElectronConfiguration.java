package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Setter;

public class ElectronConfiguration {
    @Setter
    private int atomicNumber;
    private ArrayList<Character> oribtCharacters = new ArrayList<>(Arrays.asList('s', 'p', 'd', 'f', 'g', 'h', 'i'));
    private ArrayList<String> electronValues = new ArrayList<>();

    private static Logger LOG = LoggerFactory.getLogger(ElectronConfiguration.class);

    public void getElectronConfiguration() {
        int indexMax = 0;
        int index = 0;
        int repeat = 2;

        int s = 1;
        int p = 2;
        int d = 3;
        int f = 4;
        int g = 5;
        int h = 6;
        int i = 7;

        while(atomicNumber > 0) {
            if(repeat > 0) {
                switch (oribtCharacters.get(index)) {
                    case 's':
                        if(atomicNumber - 2 >= 0) {
                            atomicNumber -= 2;
                            electronValues.add(s + "s^2");
                            s++;
                            index = indexMax;
                            repeat -= 1;
                        } else {
                            offAtomic(s, 's', 2);
                        }
                        break;
                    case 'p':
                        if(atomicNumber - 6 >= 0) {
                            atomicNumber -= 6;
                            electronValues.add(p + "p^6");
                            p++;
                            index -= 1;
                        } else {
                            offAtomic(p, 'p', 6);
                        }
                        break;
                    case 'd':
                        if(atomicNumber - 10 >= 0) {
                            atomicNumber -= 10;
                            electronValues.add(d + "d^10");
                            d++;
                            index -= 1;
                        } else {
                            offAtomic(d, 'd', 10);
                        }
                        break;
                    case 'f':
                        if(atomicNumber - 14 >= 0) {
                            atomicNumber -= 14;
                            electronValues.add(f + "f^14");
                            f++;
                            index -= 1;
                        } else {
                            offAtomic(f, 'f', 14);
                        }
                        break;
                    case 'g':
                        if(atomicNumber - 18 >= 0) {
                            atomicNumber -= 18;
                            electronValues.add(g + "g^18");
                            g++;
                            index -= 1;
                        } else {
                            offAtomic(g, 'g', 18);
                        }
                        break;
                    case 'h':
                        if(atomicNumber - 22 >= 0) {
                            atomicNumber -= 22;
                            electronValues.add(h + "h^22");
                            h++;
                            index -= 1;
                        } else {
                            offAtomic(h, 'h', 22);
                        }
                        break;
                    case 'i':
                        if(atomicNumber - 26 >= 0) {
                            atomicNumber -= 26;
                            electronValues.add(i + "i^26");
                            i++;
                            index -= 1;
                        } else {
                            offAtomic(i, 'i', 26);
                        }
                        break;
                    default:
                        break;
                }
            } else {
                indexMax += 1;
                index = indexMax;
                repeat = 2;
            }
        }
        LOG.info(electronValues.toString());
    }

    private void offAtomic(int orbitNum, char c, int MaxOrbit) {
        electronValues.add(orbitNum + "" + c + "^" + atomicNumber%MaxOrbit);
        atomicNumber = 0;
    }
}