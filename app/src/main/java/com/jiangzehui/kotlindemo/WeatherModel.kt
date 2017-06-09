package com.jiangzehui.kotlindemo

/**
 * Created by jiangzehui on 17/6/1.
 */
class WeatherModel {


    /**
     * msg : success
     * result : [{"airCondition":"良","city":"南京","coldIndex":"低发期","date":"2017-06-01","distrct":"南京","dressingIndex":"薄短袖类","exerciseIndex":"不适宜","future":[{"date":"2017-06-01","dayTime":"多云","night":"晴","temperature":"33°C / 22°C","week":"今天","wind":"东风 小于3级"},{"date":"2017-06-02","dayTime":"晴","night":"晴","temperature":"33°C / 20°C","week":"星期五","wind":"东风 3～4级"},{"date":"2017-06-03","dayTime":"多云","night":"多云","temperature":"33°C / 20°C","week":"星期六","wind":"东风 3～4级"},{"date":"2017-06-04","dayTime":"多云","night":"阴","temperature":"30°C / 20°C","week":"星期日","wind":"东南风 3～4级"},{"date":"2017-06-05","dayTime":"阵雨","night":"中雨-大雨","temperature":"26°C / 20°C","week":"星期一","wind":"东南风 3～4级"},{"date":"2017-06-06","dayTime":"阵雨","night":"阴","temperature":"24°C / 17°C","week":"星期二","wind":"西南风 3～4级"},{"date":"2017-06-07","dayTime":"少云","night":"少云","temperature":"31°C / 21°C","week":"星期三","wind":"西北偏西风 2级"},{"date":"2017-06-08","dayTime":"晴","night":"少云","temperature":"33°C / 23°C","week":"星期四","wind":"西南偏南风 3级"},{"date":"2017-06-09","dayTime":"零散雷雨","night":"零散雷雨","temperature":"33°C / 23°C","week":"星期五","wind":"西南偏南风 3级"},{"date":"2017-06-10","dayTime":"雷雨","night":"雷雨","temperature":"30°C / 22°C","week":"星期六","wind":"西南偏南风 3级"}],"humidity":"湿度：51%","pollutionIndex":"85","province":"江苏","sunrise":"05:00","sunset":"19:06","temperature":"32℃","time":"13:21","updateTime":"20170601134813","washIndex":"不太适宜","weather":"多云","week":"周四","wind":"南风2级"}]
     * retCode : 200
     */

    var msg: String? = null
    var retCode: String? = null
    /**
     * airCondition : 良
     * city : 南京
     * coldIndex : 低发期
     * date : 2017-06-01
     * distrct : 南京
     * dressingIndex : 薄短袖类
     * exerciseIndex : 不适宜
     * future : [{"date":"2017-06-01","dayTime":"多云","night":"晴","temperature":"33°C / 22°C","week":"今天","wind":"东风 小于3级"},{"date":"2017-06-02","dayTime":"晴","night":"晴","temperature":"33°C / 20°C","week":"星期五","wind":"东风 3～4级"},{"date":"2017-06-03","dayTime":"多云","night":"多云","temperature":"33°C / 20°C","week":"星期六","wind":"东风 3～4级"},{"date":"2017-06-04","dayTime":"多云","night":"阴","temperature":"30°C / 20°C","week":"星期日","wind":"东南风 3～4级"},{"date":"2017-06-05","dayTime":"阵雨","night":"中雨-大雨","temperature":"26°C / 20°C","week":"星期一","wind":"东南风 3～4级"},{"date":"2017-06-06","dayTime":"阵雨","night":"阴","temperature":"24°C / 17°C","week":"星期二","wind":"西南风 3～4级"},{"date":"2017-06-07","dayTime":"少云","night":"少云","temperature":"31°C / 21°C","week":"星期三","wind":"西北偏西风 2级"},{"date":"2017-06-08","dayTime":"晴","night":"少云","temperature":"33°C / 23°C","week":"星期四","wind":"西南偏南风 3级"},{"date":"2017-06-09","dayTime":"零散雷雨","night":"零散雷雨","temperature":"33°C / 23°C","week":"星期五","wind":"西南偏南风 3级"},{"date":"2017-06-10","dayTime":"雷雨","night":"雷雨","temperature":"30°C / 22°C","week":"星期六","wind":"西南偏南风 3级"}]
     * humidity : 湿度：51%
     * pollutionIndex : 85
     * province : 江苏
     * sunrise : 05:00
     * sunset : 19:06
     * temperature : 32℃
     * time : 13:21
     * updateTime : 20170601134813
     * washIndex : 不太适宜
     * weather : 多云
     * week : 周四
     * wind : 南风2级
     */

    var result: List<ResultBean>? = null

    class ResultBean {
        var airCondition: String? = null
        var city: String? = null
        var coldIndex: String? = null
        var date: String? = null
        var distrct: String? = null
        var dressingIndex: String? = null
        var exerciseIndex: String? = null
        var humidity: String? = null
        var pollutionIndex: String? = null
        var province: String? = null
        var sunrise: String? = null
        var sunset: String? = null
        var temperature: String? = null
        var time: String? = null
        var updateTime: String? = null
        var washIndex: String? = null
        var weather: String? = null
        var week: String? = null
        var wind: String? = null
        /**
         * date : 2017-06-01
         * dayTime : 多云
         * night : 晴
         * temperature : 33°C / 22°C
         * week : 今天
         * wind : 东风 小于3级
         */

        var future: List<FutureBean>? = null

        class FutureBean {
            var date: String? = null
            var dayTime: String? = null
            var night: String? = null
            var temperature: String? = null
            var week: String? = null
            var wind: String? = null
        }
    }


}
