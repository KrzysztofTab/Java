package Projekt02;

import javax.sound.midi.*;


public class MiniMuzaAplkWrsPlc { // pierwsza wersja aplikacji

    public static void main(String[] args) {
        MiniMuzaAplkWrsPlc mini = new MiniMuzaAplkWrsPlc();
//            if (args.length < 2) {
//            System.out.println("Nie zapomnij podać argumentów określających  instrument i nutę");
//        } else {
//        int instrument = Integer.parseInt(args[0]);
        int instrument = 80;
//        int nuta = Integer.parseInt(args[1]);
        int nuta = 44;
        mini.graj(instrument, nuta);
//        }
    } // koniec main

    public void graj(int instrument, int nuta) {
        try {
            Sequencer sekwenser = MidiSystem.getSequencer();
            sekwenser.open();
            Sequence sekw = new Sequence(Sequence.PPQ, 4);
            Track sciezka = sekw.createTrack();
            MidiEvent zdarzenie = null;

            ShortMessage pierwszy = new ShortMessage();
//            "zmiany instrumentu ma numer 192"; "instrument" może on przyjmować wartości z zakresu od 0 do 127
            pierwszy.setMessage(192, 1, instrument, 0);
            MidiEvent zmienInstrument = new MidiEvent(pierwszy, 1);
            sciezka.add(zmienInstrument);

            ShortMessage a = new ShortMessage();
//            nuta - początek i koniec nuty spróbuj podawać liczby z zakresu do 0 do 127
            a.setMessage(144, 1, nuta, 100);
//             "tick :1" - Zmień zdarzenie (nie komunikat) zakończenia nuty, tak aby zostało
//            wykonane we wcześniejszym lub późniejszym takcie.
            MidiEvent nutaP = new MidiEvent(a, 1);
            sciezka.add(nutaP);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, nuta, 100);
            MidiEvent nutaK = new MidiEvent(b, 16);
            sciezka.add(nutaK);
            sekwenser.setSequence(sekw);
            sekwenser.start();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // koniec graj
} // koniec klasy
