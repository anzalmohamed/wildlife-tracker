

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
