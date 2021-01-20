package Projekt02;

import javax.sound.midi.*;

public class MiniMiniMuzaAplk {
    public static void main(String[] args) {
        MiniMiniMuzaAplk mini = new MiniMiniMuzaAplk();
        mini.graj();
    } // koniec main

    public void graj() {
        try {
//            Pobieramy obiekt Sequencer i otwieramy go (abyśmy mogli go używać,
//            gdyż po pobraniu sekwenser nie jest otwarty).
            Sequencer sekwenser = MidiSystem.getSequencer();
            sekwenser.open();
            Sequence sekw = new Sequence(Sequence.PPQ, 4);

//            Poproś obiekt Sequence o zwrócenie ścieżki — obiektu Track. Pamiętaj,
//            że obiekt Track istnieje wewnątrz obiektu Sequence, a dane MIDI — wewnątrz obiektu Track.
            Track sciezka = sekw.createTrack();

//            Utworzenie obiektu komunikatu:
            ShortMessage a = new ShortMessage();

//            Umieszczenie instrukcji w komunikacie:
//            "typ komunikatu 144"; "kanał 1"; „zacznij grać nutę 44”; "szybkość 100"
            a.setMessage(144, 1, 44, 100);

//            Instrukcje zostały zapisane w komunikacie, jednak zdarzenie MidiEvent dodaje do nich określenie momentu,
//            kiedy te instrukcje należy wykonać. Przedstawione zdarzenie informuje, że instrukcję „a” należy wykonać
//            w pierwszym takcie (takcie o numerze 1).
            MidiEvent nutaP = new MidiEvent(a, 1);

//            Wszystkie zdarzenia MidiEvent są przechowywane na ścieżce. Sekwencja porządkuje zdarzenia na
//            podstawie czasu, w którym mają zostać wykonane, a następnie sekwenser odtwarza je w określonej
//            kolejności. W tej samej chwili może zachodzić dowolnie wiele zdarzeń. Na przykład, mógłbyś
//            chcieć, aby jednocześnie były grane dwie nuty, a nawet, żeby w tej samej chwili dwa instrumenty
//            grały dwa różne dźwięki
            sciezka.add(nutaP);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent nutaK = new MidiEvent(b, 16);
            sciezka.add(nutaK);

//            Przekazujemy obiekt Sequence do obiektu Sequencer (to tak,
//            akbyśmy wkładali płytę kompaktową do odtwarzacza).
            sekwenser.setSequence(sekw);

//            Rozpoczynamy odtwarzanie (to tak, jakbyśmy nacisnęli przycisk PLAY).
            sekwenser.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } // koniec graj
} // koniec klasy
