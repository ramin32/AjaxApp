//Browser Support Code
function add(){
    var ajaxRequest;  // The variable that makes Ajax possible!

    try{
        // Opera 8.0+, Firefox, Safari
        ajaxRequest = new XMLHttpRequest();
    } catch (e){
        // Internet Explorer Browsers
        try{
            ajaxRequest = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            try{
                ajaxRequest = new ActiveXObject("Microsoft.XMLHTTP");
            } catch (e){
                // Something went wrong
                alert("Your browser broke!");
                return false;
            }
        }
    }
    // Create a function that will receive data sent from the server
    ajaxRequest.onreadystatechange = function(){
        if(ajaxRequest.readyState == 4 && ajaxRequest.status == 200){
            document.add_form.result.value = ajaxRequest.responseText;
        }
    }


    var first = document.add_form.first.value;
    var second = document.add_form.second.value;
    ajaxRequest.open("GET", "/AjaxApp/add?first=" + first + "&second=" + second, true);
    ajaxRequest.send(null); 

}
