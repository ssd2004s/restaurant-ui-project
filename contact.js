function contact() {
  let fname = document.getElementById('fname').value;
  let email = document.getElementById('email').value;
  let number = document.getElementById('number').value;
  let code = document.getElementById('code').value;

  document.getElementById('sp1').innerHTML = "";
  document.getElementById('sp2').innerHTML = "";
  document.getElementById('sp3').innerHTML = "";
  document.getElementById('sp4').innerHTML = "";
  document.getElementById('result').innerHTML = "";

  let isValid = true;

  if (fname === "") {
    document.getElementById('sp1').innerHTML = "Please enter the name";
    isValid = false;
  }

  if (email === "") {
    document.getElementById('sp2').innerHTML = "Please enter your email";
    isValid = false;
  }

  if (number === "") {
    document.getElementById('sp3').innerHTML = "Please enter the number";
    isValid = false;
  } else if (number.length !== 10) {
    document.getElementById('sp3').innerHTML = "Number must be 10 digits";
    isValid = false;
  }

  if (code === "") {
    document.getElementById('sp4').innerHTML = "Enter the area code";
    isValid = false;
  }

      else if(code.length!==6)
{
      document.getElementById('sp4').innerHTML = "code is must 6 digit";


}

  if (isValid) {
    document.getElementById('result').innerHTML =
      "Your info is:<br>" +
      "Name: " + fname + "<br>" +
      "Email: " + email + "<br>" +
      "Phone: " + number + "<br>" +
      "Area Code: " + code + "<br><b>Thanks!🙏</b> <br> <b> your form successfully Submitted!!<b> ";
  }
}
