package com.chordsGenerator.app

import androidx.compose.runtime.Composable

class ChordsUtils {
    companion object {
        /*
         Create a list with all the chords and returns it
         The "scale" stores related chords
         */
        @Composable
        fun generateChordList(): ArrayList<Chord> {

            val chordList = ArrayList<Chord>()

            chordList.add(
                Chord(
                    "A", R.drawable.a, arrayListOf("Bm", "D", "E", "Dbm", "Gbm", "Ab"),
                    R.raw.a
                )
            )
            chordList.add(
                Chord(
                    "Am",
                    R.drawable.a_minor,
                    arrayListOf("C", "Dm", "Em", "F", "G"),
                    R.raw.a_minor
                )
            )

            chordList.add(
                Chord(
                    "Bb",
                    R.drawable.b_flat,
                    arrayListOf("Cm", "Dm", "Eb", "F", "Gm"),
                    R.raw.b_flat
                )
            )
            chordList.add(
                Chord(
                    "Bbm",
                    R.drawable.b_flat_minor,
                    arrayListOf("Db", "Ebm", "Fm", "Gb", "Ab"),
                    R.raw.b_flat_minor
                )
            )

            chordList.add(
                Chord(
                    "B",
                    R.drawable.b,
                    arrayListOf("E", "Dbm", "Ebm", "Gb", "Abm", "Bb"),
                    R.raw.b
                )
            )
            chordList.add(
                Chord(
                    "Bm",
                    R.drawable.b_minor,
                    arrayListOf("D", "Em", "G", "A", "Db", "Gbm"),
                    R.raw.b_minor
                )
            )

            chordList.add(
                Chord(
                    "C",
                    R.drawable.c,
                    arrayListOf("Dm", "Em", "F", "G", "Am"),
                    R.raw.c
                )
            )
            chordList.add(
                Chord(
                    "Cm",
                    R.drawable.c_minor,
                    arrayListOf("Cm", "Fm", "Gm", "Ab", "Bb", "Eb"),
                    R.raw.c_minor
                )
            )

            chordList.add(
                Chord(
                    "Db",
                    R.drawable.d_flat,
                    arrayListOf("Ebm", "Fm", "Gb", "Ab", "Bbm"),
                    R.raw.d_flat
                )
            )
            chordList.add(
                Chord(
                    "Dbm",
                    R.drawable.d_flat_minor,
                    arrayListOf("Eb", "E", "Gbm", "Abm", "A", "B"),
                    R.raw.d_flat_minor
                )
            )

            chordList.add(
                Chord(
                    "D",
                    R.drawable.d,
                    arrayListOf("Em", "G", "A", "Bm", "Gbm", "Db"),
                    R.raw.d
                )
            )
            chordList.add(
                Chord(
                    "Dm",
                    R.drawable.d_minor,
                    arrayListOf("F", "Gm", "Am", "C", "Bb"),
                    R.raw.d_minor
                )
            )

            chordList.add(
                Chord(
                    "Eb",
                    R.drawable.e_flat,
                    arrayListOf("Fm", "Gm", "Ab", "Bb", "Cm"),
                    R.raw.e_flat
                )
            )
            chordList.add(
                Chord(
                    "Ebm",
                    R.drawable.e_flat_minor,
                    arrayListOf("Gb", "Abm", "Bbm", "B", "Db"),
                    R.raw.e_flat_minor
                )
            )

            chordList.add(
                Chord(
                    "E",
                    R.drawable.e,
                    arrayListOf("A", "B", "Gbm", "Abm", "Dbm", "Eb"),
                    R.raw.e
                )
            )
            chordList.add(
                Chord(
                    "Em",
                    R.drawable.e_minor,
                    arrayListOf("G", "Am", "Bm", "C", "D", "Gb"),
                    R.raw.e_minor
                )
            )

            chordList.add(
                Chord(
                    "F",
                    R.drawable.f,
                    arrayListOf("Gm", "Am", "Cm", "Dm", "Bb"),
                    R.raw.f
                )
            )
            chordList.add(
                Chord(
                    "Fm",
                    R.drawable.f_minor,
                    arrayListOf("Cm", "Ab", "Bbm", "Db", "Eb"),
                    R.raw.f_minor
                )
            )

            chordList.add(
                Chord(
                    "Gb",
                    R.drawable.g_flat,
                    arrayListOf("Abm", "Bbm", "B", "Db", "Ebm"),
                    R.raw.g_flat
                )
            )
            chordList.add(
                Chord(
                    "Gbm",
                    R.drawable.g_flat_minor,
                    arrayListOf("Ab", "A", "Bm", "Dbm", "D", "E"),
                    R.raw.g_flat_minor
                )
            )

            chordList.add(
                Chord(
                    "G",
                    R.drawable.g,
                    arrayListOf("Am", "Bm", "C", "D", "Em", "Gb"),
                    R.raw.g
                )
            )
            chordList.add(
                Chord(
                    "Gm",
                    R.drawable.g_minor,
                    arrayListOf("Cm", "Dm", "F", "Bb", "Eb"),
                    R.raw.g_minor
                )
            )

            chordList.add(
                Chord(
                    "Ab",
                    R.drawable.a_flat,
                    arrayListOf("Bbm", "Cm", "Db", "Eb", "Fm"),
                    R.raw.a_flat
                )
            )
            chordList.add(
                Chord(
                    "Abm",
                    R.drawable.a_flat_minor,
                    arrayListOf("Bb", "B", "Dbm", "Ebm", "E", "Gb"),
                    R.raw.a_flat_minor
                )
            )

            return chordList
        }
    }

}