

var usernameError, fatherNameError, addressError, pinError, mobileError,stateError,distError,quessError,ansError,captchError1,captchError2,otpError,bplNoError;
function bpldropdown(){
	  var bpltype = $('#bpldrop').find(":selected").val();
	  
	   if (bpltype==1 ){
        
         $('#bplfileid').prop('disabled',false);
          $('#bplcardnoId').prop('disabled',false);
      }
      else{
		  $('#bplcardnoId').val("");
		  $('#bplfileid').val("");
		   $('#bplfileid').prop('disabled',true);
          $('#bplcardnoId').prop('disabled',true);
	  }
}
    function validateUsername() {
        let name = $("#userNameId").val(); 
        //let regex=/^([^0-9]*)$/;
        if (name.length == "" || hasNumber(name)) { 
           // $("#userCheck").show(); 
            usernameError = true; 
               $("#userNameId").addClass("is-invalid"); 
            return false; 
        } else { 
           // $("#userCheck").hide(); 
             $("#userNameId").removeClass("is-invalid");
            usernameError = false;
        } 
     }
       function validateFathername() {
        let name = $("#fatherNameId").val(); 
        if (name.length == "" || hasNumber(name)) { 
          //  $("#fatherNameCheck").show(); 
            fatherNameError = true; 
            $("#fatherNameId").addClass("is-invalid"); 
            return false; 
        } else { 
            //$("#fatherNameCheck").hide(); 
             $("#fatherNameId").removeClass("is-invalid");
            fatherNameError = false;
        } 
     }
     function hasNumber(str){
		 return /[0-9]/.test(str);
	 }
     
      // Validate address 
      
   function validateAddress(){
	   const address = document.getElementById("addressId"); 
       if(address){
		   addressError = false;
		    address.addEventListener("blur", () => { 
		        let regex =  
		        /^[-\\/\\\\_\\() \\?\\.,#"a-zA-Z0-9 ]+$/; 
		        let addr = address.value;
		        if (!regex.test(addr)) { 
		       //    $("#addressCheck").show(); 
		            address.classList.add("is-invalid"); 
		            addressError = true; 
		        } else { 
		       //      $("#addressCheck").hide(); 
		             address.classList.remove("is-invalid"); 
		             addressError = false; 
		        } 
		    });
	   }
   }
   function validatePincode(){
	   const pincode = document.getElementById("pincodeId"); 
	   if(pincode){
		   pinError = false;
		   pincode.addEventListener("blur", () => { 
		        let regex = /^\d{6}$/; 
		        let pin = pincode.value;
		        if (!regex.test(pin)) { 
		       //    $("#pincodeCheck").show(); 
		           pincode.classList.add("is-invalid"); 
		            pinError = true; 
		             
		        } else { 
		       //      $("#pincodeCheck").hide();
                     pincode.classList.remove("is-invalid"); 
		             pinError = false; 
		        }  
		    });
	   }
   }
     
  //Validate Email 
   function validateEmail(){
	   const email = document.getElementById("emailId");
	   if(email){
		   emailError = false;
	       email.addEventListener("blur", () => {
	        let regex =  
	        /^([_\-\.0-9a-zA-Z]+)@([_\-\.0-9a-zA-Z]+)\.([a-zA-Z]){2,7}$/; 
	        let em = email.value;
	        if (!regex.test(em)) {
	         //   $("#emailCheck").show();
	            email.classList.add("is-invalid"); 
	            emailError = true; 
	           } else {
	        //    $("#emailCheck").hide();
	              email.classList.remove("is-invalid"); 
	            emailError = false; 
	           } 
	       });
	   }
   }                                           //^7[89]\d{8}$
   
      function validateMobile(){
	   const mobile = document.getElementById("mobileId");
	   if(mobile){
		    mobileError = false;
	       mobile.addEventListener("blur", () => {
	        let regex = /^[6789]\d{9}$/;
	        let mo = mobile.value;
	        if (!regex.test(mo)) {
	        //    $("#mobileCheck").show();
	             mobile.classList.add("is-invalid"); 
	            mobileError = true; 
	           } else {
	          //  $("#mobileCheck").hide();
	              mobile.classList.remove("is-invalid"); 
	            mobileError = false; 
	           } 
	       });
	   }
   }
   function validateState(){
	    var stateVal = $('#stateselid').find(":selected").val();
	    if(stateVal==-1){
			$("#stateselid").addClass("is-invalid"); 
			stateError = true;
		}
		else{
			$("#stateselid").removeClass("is-invalid"); 
			stateError = false;
		}
   }
   function validateDistrict(){
	    var distVal = $('#distselid').find(":selected").val();
	    if(distVal==-1){
			$("#distselid").addClass("is-invalid"); 
			distError = true;
		}
		else{
			$("#distselid").removeClass("is-invalid"); 
			distError = false;
		}
   }
   
   function validateSecurityQue(){
	    var quesVal = $('#securityQuestionId').find(":selected").val();
	    if(quesVal==-1){
			$("#securityQuestionId").addClass("is-invalid"); 
			quessError = true;
		}
		else{
			$("#securityQuestionId").removeClass("is-invalid"); 
			quessError = false;
		}
   }
   function validateSecurityQue(){
	    var quesVal = $('#securityQuestionId').find(":selected").val();
	    if(quesVal==-1){
			$("#securityQuestionId").addClass("is-invalid"); 
			quessError = true;
		}
		else{
			$("#securityQuestionId").removeClass("is-invalid"); 
			quessError = false;
		}
   }
   
    function validateSecurityAns(){
	    if($('#securityAnsId').val()==""){
			$("#securityAnsId").addClass("is-invalid"); 
			ansError = true;
		}
		else{
			$("#securityAnsId").removeClass("is-invalid"); 
			ansError = false;
		}
   }
   function validateCaptcha1(){
	    if($('#captch1Id').val()==""){
			$("#captch1Id").addClass("is-invalid"); 
			captchError1 = true;
		}
		else{
			$("#captch1Id").removeClass("is-invalid"); 
			captchError1 = false;
		}
   }
  function validateCaptcha2(){
	    if($('#captch2Id').val()==""){
			$("#captch2Id").addClass("is-invalid"); 
			captchError2 = true;
		}
		else{
			$("#captch2Id").removeClass("is-invalid"); 
			captchError2 = false;
		}
   }
   function validateOtp(){
	    if($('#otpId').val()==""){
			$("#otpId").addClass("is-invalid"); 
			otpError = true;
		}
		else{
			$("#otpId").removeClass("is-invalid"); 
			otpError = false;
		}
   }
   function validateBplNo(){
	   if((!($('#bplcardnoId').prop('disabled')) &&$('#bplcardnoId').val()=="") ){
		   ($('#bplcardnoId').addClass("is-invalid"));
		   bplNoError = true ;
	   }
	   else{
		   ($('#bplcardnoId').removeClass("is-invalid"));
		   bplNoError = false ;
	   }
   }
   function validateBplFile(){
	   if((!($('#bplfileid').prop('disabled')) &&$('#bplfileid').val()=="") ){
		   //($('#bplfileid').addClass("is-invalid"));
		   $("#bplFileCheck").show();
		   bplFileError = true ;
	   }
	   else{
		 //  ($('#bplfileid').removeClass("is-invalid"));
		 $("#bplFileCheck").hide();
		   bplFileError = false ;
	   }
   }
function bplfileTr(){
	 document.getElementById("bplfileid").addEventListener('change',function(){
		 validateBplFile();
	 })
	 
}
function validateForm(){
	   validateMobile();
	   validateEmail();
	   validateAddress();
	   validateFathername();
	   validateUsername();
	   validatePincode();
	   validateState();
	   validateDistrict();
	   validateSecurityQue();
	   validateSecurityAns();
	   validateBplNo();
	   validateBplFile();
	   //validateCaptcha2();
	   //validateCaptcha1();
	  // validateOtp();
	   if ( 
			   usernameError == false && 
			   fatherNameError == false && 
			   addressError == false && 
			   pinError == false &&
			   mobileError == false &&
			   emailError ==false &&
			   stateError== false &&
			   distError ==false &&
			   quessError == false &&
			   ansError ==false &&
			   bplNoError == false &&
			   bplFileError == false //&&
			   //captchError1 == false &&
			   //captchError2 == false &&
			   //otpError == false
	        ){
		   return true;
	   }
	   
   }
  
   
    
  $(document).ready(function () { 
	  $("#userCheck").hide(); 
	  $("#fatherNameCheck").hide(); 
	  $("#addressCheck").hide();
	  $("#pincodeCheck").hide();  
	   $("#userNameId").keyup(function () {
        validateUsername(); 
       });
       $("#fatherNameId").keyup(function () {
        validateFathername(); 
       });
        validatePincode();
        validateEmail();
        validateAddress();
       $("#emailCheck").hide();
       $("#mobileCheck").hide();
       validateMobile();
        bpldropdown();
       $('#bpldrop').change(function(){
		   bpldropdown();
		  validateBplNo();
		  validateBplFile(); 
	   });
	    validateBplNo();
	    validateBplFile();
	    bplfileTr();
	    $('#stateselid').change(function(){
		   validateState();
	   });
       $('#distselid').change(function(){
		   validateDistrict();
	   });
	    $('#securityQuestionId').change(function(){
		   validateSecurityQue();
	   });
	   
	    $("#securityAnsId").keyup(function () {
         validateSecurityAns();
       });
        $("#bplcardnoId").keyup(function () {
         validateBplNo();
       });
       $("#captch1Id").keyup(function () {
        // validateCaptcha1();
       });
       $("#captch2Id").keyup(function () {
        // validateCaptcha2();
       });
       $("#otpId").keyup(function () {
         validateOtp();
       });
     $('#registerFormId').submit(function (event) {
           // Prevent form submission
           event.preventDefault();
           // If all validations pass, submit the form
           if (validateForm()) {
               this.submit();
           }
       });
   })