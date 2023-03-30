package com.example.myquizapp

object Questions {


    fun getQuestions():ArrayList<Question>{

        val questionList= ArrayList<Question>()



        val soru1 = Question(1,
             "Dünyanın en iyi futbolcusu kimdir",
            "Messi",
            "Ronaldo(CR7)",
            "Ronaldinho",
            "Mbappe",
             1)

        questionList.add(soru1)


        val soru2 = Question(2,
            "Hangi ünlü üniversite mezunudur",
            "Recep Tayyip Erdoğan",
            "Bülent ecevit",
            "Yılmaz Erdoğan",
            "Kadir İnanır",
            4)

        questionList.add(soru2)



        val soru3 = Question(3,
            "Bugüne kadar düzenlenen FIFA Dünya Kupası turnuvalarında en çok gol atan kimdir?",
            "Pele",
            "Maradona",
            "Cristiano Ronaldo",
            "Miroslav Klose",
            4)

        questionList.add(soru3)




        val soru4 = Question(4,
            "5 makinenin 5 cihaz üretmesi 5 dakika sürüyorsa 100 makinenin 100 cihaz üretmesi ne kadar sürer?",
            "5 dakika",
            "25 dakika",
            "1 saat 40 dakika",
            "1 saat",
            3)

        questionList.add(soru4)



        val soru5 = Question(5,
            "Basketbolda çembere yan durarak tek elle baş üzerinden geçirilerek atılan şuta ne ad verilir?",
            "Cemşat",
            "Hukşat",
            "Plonjon",
            "Degaj",
            2)

        questionList.add(soru5)


        val soru6 = Question(6,
            "Büyük Britanya'daki başkentleri gezdim\" diyen biri hangi şehre gittiğini söylemiş olmaz?",
            "Dublin",
            "Londra",
            "Cardiff",
            "Edinburg",
            1)

        questionList.add(soru6)



        val soru7 = Question(7,
            "Hangisi atomlarda bulunan temel parçacıklardan biri değildir?",
            "Proton",
            "Nötron",
            "Elektron",
            "Megatron",
            4)

        questionList.add(soru7)



        val soru8 = Question(8,
            "Hangisi G.O.R.A. adlı filmde geçen bir repliktir?",
            "Dünyalılardan tiskiniyorum!",
            "Vurucam kırbacı!",
            "Araba nerde? Para nerde?",
            "Zeki Müren de bizi görecek mi? ",
            1)

        questionList.add(soru8)



        val soru9 = Question(9,
            "Al Pease, Formula 1 tarihinde, hangi sebepten dolayı yarışmadan diskalifiye edilen ilk ve tek sporcudur?",
            "Çok yavaş gitmek",
            "Emniyet kemeri takmamak",
            "Ehliyetini evde unutmak",
            "Araçta müzik dinlemek",
            1)

        questionList.add(soru9)



        val soru10 = Question(10,
            "Ünlü çizgi karakterlerden hangisi fare değildir?",
            "Mickey Mouse",
            "Jerry",
            "Sonic",
            "Speed Gonzales",
            3)

        questionList.add(soru10)


        return questionList

    }
}