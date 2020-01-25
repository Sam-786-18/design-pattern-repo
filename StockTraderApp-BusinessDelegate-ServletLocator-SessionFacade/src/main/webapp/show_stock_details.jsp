
<%@page isELIgnored="false" %>

<h1 style="color:red;text-align:center">Result page </h1>

Stock Id :: ${stockDetails.stockId} <br>
Stock name :: ${stockDetails.stockName} <br>
Country :: ${stockDetails.country} <br>
Exchnage name :: ${stockDetails.exchangeName} <br>
Stock price :: ${stockDetails.stockPrice} <br>
Stock Future price :: ${stockDetails.stockFuturePrice} <br>

<a href="get_stock_value.html">home</a>