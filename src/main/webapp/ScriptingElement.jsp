<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Scripting Element</title>
</head>
<body>


<span>This is Expression tag</span>	<%=10+20%>
<hr/>
<h3>Multiplication Table using the scriptlet tag</h3>
<%
	for(int i=1;i<=10;i++){
%>
<table>
<tr>
<td><%=9%></td>
<td><%="X"%></td>
<td><%=i%></td>
<td><%="="%></td>
<td><%=(9*i)%></td>
</tr>
<%} %>
</table>
	
	
	<hr/>
	
	<%! int getCube(int no){ return no*no*no; }%>
	
	<span>10 Cube is  = </span><%=getCube(10)%>
	
	
	<hr/>
	
	<h3>First 50 Prime Number</h3>
	<%! int count=0;
	
	ArrayList<Integer>list=new ArrayList<Integer>();
	boolean isPrime(int n){
        boolean flag=true;
        if(n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return flag;
    }
	
	void displayPrime(){
		boolean ans;
		int i=1;
		while(count!=50){
			ans=isPrime(i);
			if(ans){
				
				count++;
				list.add(i);
			}
			i++;
		}
	}
	
	
	
	
	%>
	
	<%
	displayPrime();
	int cnt=0; 
	for(Integer i:list){
		if(cnt==20 || cnt==40){
		%>
		<br/>
		 
	<%} %>
		<%= i %>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<%
	cnt++;
	} %>
	
	

</body>
</html>