fun main(args: Array<String>) {
    val produtosEstoque = mutableListOf<String>()
    while (true) {
        println("Digite um número sendo: ")
        println("1 - Adicionar")
        println("2 - Remover")
        println("3 - Atualizar")
        println("4 - Listar")
        println("5 - Finalizar")

        print("Opção selecionada: ")
        val opcao = readln().toInt()

        when (opcao) {

            1 -> {
                println("Digite o produto: ")
                val produto = readln()
                if (produto != "") {
                    produtosEstoque.add(produto)
                    println("Produto cadastrado com sucesso!")
                } else {
                    println("Opção inválida.")
                }
            }

            2 -> {
                println("Digite o produto a ser removido:")
                val produtoRemov = readln()

                if (produtosEstoque.contains(produtoRemov)) {
                    produtosEstoque.remove(produtoRemov)
                } else {
                    println("Produto inexistente.")

                }
            }
            3 -> {
                println("Estoque: ")
                produtosEstoque.forEach {
                    println(it)
                }
                println("Digite o produdo que será atualizado: ")
                val produtoAtul = readln()
                if (produtosEstoque.contains(produtoAtul)) {
                    val index = produtosEstoque.indexOf(produtoAtul)
                    println("Digite a atualização: ")
                    val produtoAtualizado = readln()

                    produtosEstoque[index] = produtoAtualizado
                    println("Produto atualizado com sucesso!")
                } else {
                    println("Produto não existe no estoque.")
                }
            }
            4 -> {
                println("Produtos me estoque: ")
                produtosEstoque.forEach {
                    println(it)
                }
            }
            5 -> break

            else -> println("Opção inválida.")

        }
        }
    }













