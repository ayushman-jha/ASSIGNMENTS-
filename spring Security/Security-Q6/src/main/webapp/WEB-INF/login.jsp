<center>
<h1>Welcome to Spring Boot Security</h1>

<h2>Login Page</h2>

<form method="POST" action="/login">
	User Name : <input type="text" name="username" /><br><br>
	Password  : <input type="password" name="password"/><br><br>
	Remember me : <input type="checkbox" name="remember-me"/><br><br>
	<input type="hidden"                          
        name="${_csrf.parameterName}"  
        value="${_csrf.token}"/>  
	<input type="submit" name="submit"/>
</form>
</center>