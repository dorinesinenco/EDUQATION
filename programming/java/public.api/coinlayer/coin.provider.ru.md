# Суть примера - реализовать логику получения данных с внешнего портала API.
> В данном примере будет применена урезанная логика SPI шаблона (Serive Provider Interface). Рекомендуется погуглить на эту тему так как следующий пример будет тесно с этим связан. А в текущем примере будет рассмотрен упрощенный вариант SPI.

* Суть сводиться к тому что нам необходимо создать "интерфейс" для облегчения получения инфы с удаленного ресурса.
* В качестве поставщика данных будет использован [https://coinlayer.com](https://coinlayer.com). Но кому будет интересно, вот еще [список](https://github.com/public-apis/public-apis) разных доступных провайдеров.

* ПЕРВЫЙ ЭТАП, необходимо [создать аккаунт](https://coinlayer.com/signup/free) на coinlayer в процессе вы получите доступ к авторизационному ключу.
* Обмен данными с этим API будет происходить через по http(s)
* При этом если обратить внимание на их API, в нем есть очень много "endpoints" адрессов или страниц, каждая из которых выдает определенный тип информации
* Так же обратите внимание что для того чтобы передавать настройки (фильтра) в URL вбивают,парами "параметры": напр **access_key=YOUR_ACCESS_KEY** ключ доступа
* Между параметрами URL вставляются "&"-ы а первый параметр всегда после адреса "endpoint" вставляется через "?"
* Так что, например - если бы нам захотелось получить текущую инфу по валютам **https://api.coinlayer.com/live?access_key=YOUR_ACCESS_KEY**


* Документация [тут](https://coinlayer.com/documentation)
* Полученные данные распарсить в виде JSON при помощи https://mvnrepository.com/artifact/org.json/json
* Рекомендуется ознакомится с принципом работы "карты" [HashMap](https://www.w3schools.com/java/java_hashmap.asp)
---
Требуется выполнить следующее:
1.  Создать класс "CoinRateProvider" вот стартер код:

```java
public class CoinRateProvider {

	
	/**
	 * endpoint: Reques thttps://api.coinlayer.com/live
	 * возвращает карту где код валюты - ключ, а коэфициент - значение
	 * */
	public HashMap<String,Float>  getLiveRates() {
		
	}

	/**
	 * endpoint: Request https://api.coinlayer.com/live
	 * возвращает карту где код валюты - ключ, а коэфициент - значение
	 * параметр "currencies" служит фильтром (мы передаем коды тех валют что нас интересуют) 
	 * */
	public HashMap<String,Float>  getLiveRates(HashSet<String> currencies) {
		
	}
	
	
	/**
	 * endpoint: https://api.coinlayer.com/YYYY-MM-DD
	 * возвращает карту где код валюты - ключ, а коэфициент - значение - за определенную дату
	 * */	
	public HashMap<String,Float>  getHistoricalRates() {
		
	}	

	/**
	 * endpoint: https://api.coinlayer.com/YYYY-MM-DD
	 * возвращает карту где код валюты - ключ, а коэфициент - значение - за определенную дату
	 * параметр "currencies" служит фильтром (мы передаем коды тех валют что нас интересуют) 
	 * */	
	public HashMap<String,Float>  getHistoricalRates(HashSet<String> currencies) {
		
	}	
	
}

```

---
БОНУС - после реализации методов, улучшить код класс провайдера.

