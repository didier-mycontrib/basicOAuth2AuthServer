cd /d "%~dp0"

set URL=http://localhost:8081/basic-oauth-server/index.html
curl %URL%

set GET_ACCESS_TOKEN_URL=http://localhost:8081/basic-oauth-server/oauth/token
curl --user fooClientIdPassword:secret -v -d grant_type=password -d username=user1 -d password=pwd1 %GET_ACCESS_TOKEN_URL%
	
pause