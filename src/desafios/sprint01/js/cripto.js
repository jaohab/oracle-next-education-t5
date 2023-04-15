var but_copy = "<button class='but_copy' onClick ='copy()'>Copiar</button>";

function encrypt() {

    // Limpa o conteúdo da div
    document.getElementById("resultado").innerHTML = "";

    // Recebe a string
    let txtOriginal = document.getElementById("textarea").value;

    // Converte a string para letrar minúsculas
    let txtLower = txtOriginal.toLowerCase();

    // (LÓGICA) - Loop para encontrar cada vogal
    for (let i = 0; i < txtLower.length; i++) {
        // Letra "a" 
        if (txtLower[i] === "a") {
            // Validação
            console.log("achou 'a' na posição " + i);
            // Inserindo a sentença "ai"
            let txtTemp = txtLower.slice(0, i) + "ai" + txtLower.slice(i+1);
            txtLower = txtTemp;
            // Atualizar o index para evitar reprocessamentos
            i += 2;
        }

        // Letra "e" 
        if (txtLower[i] === "e") {
            // Validação
            console.log("achou 'e' na posição " + i);
            // Inserindo a sentença "enter"
            let txtTemp = txtLower.slice(0, i) + "enter" + txtLower.slice(i+1);
            txtLower = txtTemp;
            // Atualizar o index para evitar reprocessamentos
            i += 5;
        }

        // Letra "i" 
        if (txtLower[i] === "i") {
            // Validação
            console.log("achou 'i' na posição " + i);
            // Inserindo a sentença "imes"
            let txtTemp = txtLower.slice(0, i) + "imes" + txtLower.slice(i+1);
            txtLower = txtTemp;
            // Atualizar o index para evitar reprocessamentos
            i += 4;
        }

        // Letra "o" 
        if (txtLower[i] === "o") {
            // Validação
            console.log("achou 'o' na posição " + i);
            // Inserindo a sentença "ober"
            let txtTemp = txtLower.slice(0, i) + "ober" + txtLower.slice(i+1);
            txtLower = txtTemp;
            // Atualizar o index para evitar reprocessamentos
            i += 4;

        }

        // Letra "u" 
        if (txtLower[i] === "u") {
            // Validação
            console.log("achou 'u' na posição " + i);
            // Inserindo a sentença "ufat"
            let txtTemp = txtLower.slice(0, i) + "ufat" + txtLower.slice(i+1);
            txtLower = txtTemp;
            // Atualizar o index para evitar reprocessamentos
            i += 4;
        }
    }

    // Exibe a mensagem criptografada
    document.getElementById("resultado").innerHTML = "<div class='innerContent' id='conteudo'>" + txtLower + "</div>";
    document.getElementById("botao").innerHTML = but_copy;

}

function decrypt() {

    // Limpa o conteúdo da div
    document.getElementById("resultado").innerHTML = "";

    // Recebe a string
    let txtOriginal = document.getElementById("textarea").value;

    // Converte a string para letrar minúsculas
    let txtLower = txtOriginal.toLowerCase();

    // (LÓGICA) - Loop para encontrar cada padrão
    // Retornando a letra "a"
    while (true) {
        let i =  txtLower.indexOf("ai");
        if (i > -1) {
            let txtTemp = txtLower.slice(0, i+1) + txtLower.slice(i+2);
            txtLower = txtTemp;
        } else {
            break;
        }
    }

    // Retornando a letra "e"
    while (true) {
        let i =  txtLower.indexOf("enter");
        if (i > -1) {
            let txtTemp = txtLower.slice(0, i+1) + txtLower.slice(i+5);
            txtLower = txtTemp;
        } else {
            break;
        }
    }

    // Retornando a letra "i"
    while (true) {
        let i =  txtLower.indexOf("imes");
        if (i > -1) {
            let txtTemp = txtLower.slice(0, i+1) + txtLower.slice(i+4);
            txtLower = txtTemp;
        } else {
            break;
        }
    }

    // Retornando a letra "o"
    while (true) {
        let i =  txtLower.indexOf("ober");
        if (i > -1) {
            let txtTemp = txtLower.slice(0, i+1) + txtLower.slice(i+4);
            txtLower = txtTemp;
        } else {
            break;
        }
    }

    // Retornando a letra "u"
    while (true) {
        let i =  txtLower.indexOf("ufat");
        if (i > -1) {
            let txtTemp = txtLower.slice(0, i+1) + txtLower.slice(i+4);
            txtLower = txtTemp;
        } else {
            break;
        }
    }
    
    // Exibe a mensagem criptografada
    document.getElementById("resultado").innerHTML = "<div class='innerContent' id='conteudo'>" + txtLower + "</div>";
    document.getElementById("botao").innerHTML = but_copy;
}

function copy() {
    let content = document.getElementById("conteudo").innerHTML;
    navigator.clipboard.writeText(content);
    alert ("Mensagem copiada!");
}