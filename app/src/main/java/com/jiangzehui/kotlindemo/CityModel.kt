package com.jiangzehui.kotlindemo

/**
 * Created by jiangzehui on 17/5/31.
 */
class CityModel {




    var msg: String? = null
    var retCode: String? = null
    var result: List<ResultBean>? = null

    class ResultBean {
        var province: String? = null
        /**
         * city : 合肥
         * district : [{"district":"合肥"},{"district":"长丰"},{"district":"肥东"},{"district":"肥西"},{"district":"巢湖"},{"district":"庐江"}]
         */

        var city: List<CityBean>? = null

        class CityBean {
            var city: String? = null
            /**
             * district : 合肥
             */

            var district: List<DistrictBean>? = null

            class DistrictBean {
                var district: String? = null
            }
        }
    }
}
