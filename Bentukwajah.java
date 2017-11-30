class Bentukwajah{
    /* Membuat sebuah method respons pada calss induk
    dimana mengembalikan sebuah nilai stringg */
    public String respons(){
        return("Perhatikan reaksi wajah saya \n");
    }
}

    /*Membat class - class lain dengan turunan
    dari class Bentukwajah*/
class Senyum extends Bentukwajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends Bentukwajah{
    public String respons(){
        return("Tertawa karena gembira\n");
    }
}

class Marah extends Bentukwajah{
    public String respons(){
        return("kemarahan disebabkan bertengkar\n");
    }
}

class Sedih extends Bentukwajah{
    public String respons(){
        return("Sedih disebabkan cemburu\n");
    }
}