fun main(){
    val nomes = mutableListOf<String>()

    while (true){
        println("Digite alguns nomes para adicionar na lista: ")
        val valor = readln()

        if(valor != ""){
            nomes.add(valor)
        }else{
            break
        }
    }

    println("O tamanho da lista é: ${nomes.size}")
    println(nomes)

    //remove - Exclui um item da lista
    while (true){
        println("Digite um nome para você deletar da lista: ")
        val valor = readln()

        //contains - Verifica se um valor existe na lista
        if(nomes.contains(valor)){
            nomes.remove(valor)
            break
        }else{
            println("O nome $valor não existe na lista")
        }
    }

    println("O tamanho da lista é: ${nomes.size}")
    println(nomes)
}