$(document).ready(function(){
    $("#developmentImage").click(function(){
        $("#developmentImage").slideDown('1500').hide('1000');
        $("#development").show('1500');
    });
    $("#development").click(function(){
        $("#development").slideUp('1500');
        $("#developmentImage").slideDown('1500');
    });
});

$(document).ready(function(){
    $("#designImage").click(function(){
        $("#designImage").slideDown('1500').hide('1000');
        $("#design").show('1500');
    });
    $("#design").click(function(){
        $("#design").slideUp('1500');
        $("#designImage").slideDown('1500');
    });
});
$(document).ready(function(){
    $("#productImage").click(function(){
        $("#productImage").slideDown('1500').hide('1000');
        $("#product").show('1500');
    });
    $("#product").click(function(){
        $("#product").slideUp('1500');
        $("#productImage").slideDown('1500');
    });
});
$(document).ready(function(){
    $("form").submit(function(event){
        event.preventDefault();
        let name = $("input#name").val();
        let email = $("input#email").val();
        let message = $("textarea#comment").val();
        if ($("input#name").val() && $("input#email").val()){
            alert (name + ", we have received your message. Thank you for reaching out to us.");
        }
        else {
            alert("Please enter your name and email!");
        }
    });
});



