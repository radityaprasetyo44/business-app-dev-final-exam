/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalExam;

    abstract class Hewan {
        protected abstract void munculSuara();
    }

    class Kucing extends Hewan {
        @Override
        protected void munculSuara() {
            System.out.println("Suara Kucing: Meow");
        }

    }

    class Kambing extends Hewan {
        @Override
        protected void munculSuara() {
            System.out.println("Suara Kambing: Mbek");
        }
    }

    public class NO_4_OVERRIDING {
        public static void main (String[] args) {
            Hewan kucing = new Kucing();
            kucing.munculSuara();

            Hewan burung = new Kambing();
            burung.munculSuara();
        }
    }
