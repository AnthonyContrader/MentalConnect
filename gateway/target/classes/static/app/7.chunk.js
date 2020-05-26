(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[7],{

/***/ "./src/main/webapp/app/admin/metrics/metrics.component.ts":
/*!****************************************************************!*\
  !*** ./src/main/webapp/app/admin/metrics/metrics.component.ts ***!
  \****************************************************************/
/*! exports provided: MetricsComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"MetricsComponent\", function() { return MetricsComponent; });\n/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js\");\n/* harmony import */ var rxjs_operators__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! rxjs/operators */ \"./node_modules/rxjs/_esm5/operators/index.js\");\n/* harmony import */ var _metrics_service__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./metrics.service */ \"./src/main/webapp/app/admin/metrics/metrics.service.ts\");\n/* harmony import */ var ng_jhipster__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ng-jhipster */ \"./node_modules/ng-jhipster/__ivy_ngcc__/fesm5/ng-jhipster.js\");\n/* harmony import */ var _fortawesome_angular_fontawesome__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @fortawesome/angular-fontawesome */ \"./node_modules/@fortawesome/angular-fontawesome/__ivy_ngcc__/fesm5/angular-fontawesome.js\");\n/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! @angular/common */ \"./node_modules/@angular/common/__ivy_ngcc__/fesm5/common.js\");\n\n\n\n\n\n\n\n\nfunction MetricsComponent_div_19_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"div\", 12);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](2, \"jhi-jvm-memory\", 13);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](3, \"\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](4, \"\\n\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](5, \"jhi-jvm-threads\", 14);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](6, \"\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](7, \"\\n\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](8, \"jhi-metrics-system\", 15);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](9, \"\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](10, \"\\n    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} if (rf & 2) {\n    const ctx_r0 = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵnextContext\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](2);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"updating\", ctx_r0.updatingMetrics)(\"jvmMemoryMetrics\", ctx_r0.metrics.jvm);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](3);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"threadData\", ctx_r0.threads);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](3);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"updating\", ctx_r0.updatingMetrics)(\"systemMetrics\", ctx_r0.metrics.processMetrics);\n} }\nfunction MetricsComponent_div_21_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"div\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](2, \"h3\", 16);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](3, \"Garbage collector statistics\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](4, \"\\n\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](5, \"jhi-metrics-garbagecollector\", 17);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](6, \"\\n        \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](7, \"\\n    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} if (rf & 2) {\n    const ctx_r1 = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵnextContext\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](5);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"updating\", ctx_r1.updatingMetrics)(\"garbageCollectorMetrics\", ctx_r1.metrics.garbageCollector);\n} }\nfunction MetricsComponent_div_23_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"div\", 18);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"Updating...\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} }\nfunction MetricsComponent_jhi_metrics_request_25_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"jhi-metrics-request\", 19);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} if (rf & 2) {\n    const ctx_r3 = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵnextContext\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"updating\", ctx_r3.updatingMetrics)(\"requestMetrics\", ctx_r3.metrics[\"http.server.requests\"]);\n} }\nfunction MetricsComponent_jhi_metrics_endpoints_requests_27_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"jhi-metrics-endpoints-requests\", 20);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} if (rf & 2) {\n    const ctx_r4 = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵnextContext\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"updating\", ctx_r4.updatingMetrics)(\"endpointsRequestsMetrics\", ctx_r4.metrics.services);\n} }\nfunction MetricsComponent_jhi_metrics_cache_29_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"jhi-metrics-cache\", 21);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} if (rf & 2) {\n    const ctx_r5 = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵnextContext\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"updating\", ctx_r5.updatingMetrics)(\"cacheMetrics\", ctx_r5.metrics.cache);\n} }\nfunction MetricsComponent_jhi_metrics_datasource_31_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"jhi-metrics-datasource\", 22);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} if (rf & 2) {\n    const ctx_r6 = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵnextContext\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"updating\", ctx_r6.updatingMetrics)(\"datasourceMetrics\", ctx_r6.metrics.databases);\n} }\nclass MetricsComponent {\n    constructor(metricsService, changeDetector) {\n        this.metricsService = metricsService;\n        this.changeDetector = changeDetector;\n        this.updatingMetrics = true;\n    }\n    ngOnInit() {\n        this.refresh();\n    }\n    refresh() {\n        this.updatingMetrics = true;\n        this.metricsService\n            .getMetrics()\n            .pipe(Object(rxjs_operators__WEBPACK_IMPORTED_MODULE_1__[\"flatMap\"])(() => this.metricsService.threadDump(), (metrics, threadDump) => {\n            this.metrics = metrics;\n            this.threads = threadDump.threads;\n            this.updatingMetrics = false;\n            this.changeDetector.detectChanges();\n        }))\n            .subscribe();\n    }\n    metricsKeyExists(key) {\n        return this.metrics && this.metrics[key];\n    }\n    metricsKeyExistsAndObjectNotEmpty(key) {\n        return this.metrics && this.metrics[key] && JSON.stringify(this.metrics[key]) !== '{}';\n    }\n}\nMetricsComponent.ɵfac = function MetricsComponent_Factory(t) { return new (t || MetricsComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdirectiveInject\"](_metrics_service__WEBPACK_IMPORTED_MODULE_2__[\"MetricsService\"]), _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdirectiveInject\"](_angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ChangeDetectorRef\"])); };\nMetricsComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdefineComponent\"]({ type: MetricsComponent, selectors: [[\"jhi-metrics\"]], decls: 34, vars: 7, consts: [[\"id\", \"metrics-page-heading\", \"jhiTranslate\", \"metrics.title\"], [1, \"btn\", \"btn-primary\", \"float-right\", 3, \"click\"], [\"icon\", \"sync\"], [\"jhiTranslate\", \"metrics.refresh.button\"], [\"jhiTranslate\", \"metrics.jvm.title\"], [\"class\", \"row\", 4, \"ngIf\"], [4, \"ngIf\"], [\"class\", \"well well-lg\", \"jhiTranslate\", \"metrics.updating\", 4, \"ngIf\"], [3, \"updating\", \"requestMetrics\", 4, \"ngIf\"], [3, \"updating\", \"endpointsRequestsMetrics\", 4, \"ngIf\"], [3, \"updating\", \"cacheMetrics\", 4, \"ngIf\"], [3, \"updating\", \"datasourceMetrics\", 4, \"ngIf\"], [1, \"row\"], [1, \"col-md-4\", 3, \"updating\", \"jvmMemoryMetrics\"], [1, \"col-md-4\", 3, \"threadData\"], [1, \"col-md-4\", 3, \"updating\", \"systemMetrics\"], [\"jhiTranslate\", \"metrics.jvm.gc.title\"], [3, \"updating\", \"garbageCollectorMetrics\"], [\"jhiTranslate\", \"metrics.updating\", 1, \"well\", \"well-lg\"], [3, \"updating\", \"requestMetrics\"], [3, \"updating\", \"endpointsRequestsMetrics\"], [3, \"updating\", \"cacheMetrics\"], [3, \"updating\", \"datasourceMetrics\"]], template: function MetricsComponent_Template(rf, ctx) { if (rf & 1) {\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"div\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](2, \"h2\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](3, \"\\n        \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](4, \"span\", 0);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](5, \"Application Metrics\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](6, \"\\n\\n        \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](7, \"button\", 1);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵlistener\"](\"click\", function MetricsComponent_Template_button_click_7_listener() { return ctx.refresh(); });\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](8, \"\\n            \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelement\"](9, \"fa-icon\", 2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](10, \" \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](11, \"span\", 3);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](12, \"Refresh\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](13, \"\\n        \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](14, \"\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](15, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](16, \"h3\", 4);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](17, \"JVM Metrics\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](18, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](19, MetricsComponent_div_19_Template, 11, 5, \"div\", 5);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](20, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](21, MetricsComponent_div_21_Template, 8, 2, \"div\", 6);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](22, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](23, MetricsComponent_div_23_Template, 2, 0, \"div\", 7);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](24, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](25, MetricsComponent_jhi_metrics_request_25_Template, 2, 2, \"jhi-metrics-request\", 8);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](26, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](27, MetricsComponent_jhi_metrics_endpoints_requests_27_Template, 2, 2, \"jhi-metrics-endpoints-requests\", 9);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](28, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](29, MetricsComponent_jhi_metrics_cache_29_Template, 2, 2, \"jhi-metrics-cache\", 10);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](30, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](31, MetricsComponent_jhi_metrics_datasource_31_Template, 2, 2, \"jhi-metrics-datasource\", 11);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](32, \"\\n\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](33, \"\\n\");\n    } if (rf & 2) {\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](19);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngIf\", ctx.metrics && !ctx.updatingMetrics);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngIf\", ctx.metrics && ctx.metricsKeyExists(\"garbageCollector\"));\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngIf\", ctx.updatingMetrics);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngIf\", ctx.metrics && ctx.metricsKeyExists(\"http.server.requests\"));\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngIf\", ctx.metrics && ctx.metricsKeyExists(\"services\"));\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngIf\", ctx.metrics && ctx.metricsKeyExists(\"cache\"));\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngIf\", ctx.metrics && ctx.metricsKeyExistsAndObjectNotEmpty(\"databases\"));\n    } }, directives: [ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"JhiTranslateDirective\"], _fortawesome_angular_fontawesome__WEBPACK_IMPORTED_MODULE_4__[\"FaIconComponent\"], _angular_common__WEBPACK_IMPORTED_MODULE_5__[\"NgIf\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵd\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵe\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵj\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵk\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵf\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵg\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵh\"], ng_jhipster__WEBPACK_IMPORTED_MODULE_3__[\"ɵi\"]], encapsulation: 2, changeDetection: 0 });\n/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵsetClassMetadata\"](MetricsComponent, [{\n        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"Component\"],\n        args: [{\n                selector: 'jhi-metrics',\n                templateUrl: './metrics.component.html',\n                changeDetection: _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ChangeDetectionStrategy\"].OnPush,\n            }]\n    }], function () { return [{ type: _metrics_service__WEBPACK_IMPORTED_MODULE_2__[\"MetricsService\"] }, { type: _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ChangeDetectorRef\"] }]; }, null); })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL21ldHJpY3MvbWV0cmljcy5jb21wb25lbnQudHM/MjJlOSIsIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL21ldHJpY3MvbWV0cmljcy5jb21wb25lbnQuaHRtbD9iZTY3Il0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBOEY7QUFDckQ7QUFFbUQ7Ozs7Ozs7SUNReEYsMEVBQ0k7SUFBQTtJQUFBLHFGQUNBO0lBQUE7SUFBQSw0REFBaUI7SUFFakI7SUFBQSxzRkFDQTtJQUFBO0lBQUEsNERBQWtCO0lBRWxCO0lBQUEseUZBQ0E7SUFBQTtJQUFBLDREQUFxQjtJQUN6QjtJQUFBLDREQUFNOzs7SUFSK0IsMERBQTRCO0lBQTVCLDRGQUE0QjtJQUczQiwwREFBc0I7SUFBdEIsc0ZBQXNCO0lBR25CLDBEQUE0QjtJQUE1Qiw0RkFBNEI7OztJQUlyRSxzRUFDSTtJQUFBO0lBQUEseUVBQXdDO0lBQUEsdUZBQTRCO0lBQUEsNERBQUs7SUFFekU7SUFBQSxtR0FDQTtJQUFBO0lBQUEsNERBQStCO0lBQ25DO0lBQUEsNERBQU07OztJQUY0QiwwREFBNEI7SUFBNUIsNEZBQTRCOzs7SUFJOUQsMEVBQWtGO0lBQUEsc0VBQVc7SUFBQSw0REFBTTs7O0lBRW5HLDBGQUNBO0lBQUE7SUFBQSw0REFBc0I7OztJQUQyRCw0RkFBNEI7OztJQUc3RyxxR0FDQTtJQUFBO0lBQUEsNERBQWlDOzs7SUFEK0MsNEZBQTRCOzs7SUFHNUcsd0ZBQ0E7SUFBQTtJQUFBLDREQUFvQjs7O0lBRDRDLDRGQUE0Qjs7O0lBRzVGLDZGQUNBO0lBQUE7SUFBQSw0REFBeUI7OztJQURpRSw0RkFBNEI7O0FEOUJuSCxNQUFNLGdCQUFnQjtJQUszQixZQUFvQixjQUE4QixFQUFVLGNBQWlDO1FBQXpFLG1CQUFjLEdBQWQsY0FBYyxDQUFnQjtRQUFVLG1CQUFjLEdBQWQsY0FBYyxDQUFtQjtRQUY3RixvQkFBZSxHQUFHLElBQUksQ0FBQztJQUV5RSxDQUFDO0lBRWpHLFFBQVE7UUFDTixJQUFJLENBQUMsT0FBTyxFQUFFLENBQUM7SUFDakIsQ0FBQztJQUVELE9BQU87UUFDTCxJQUFJLENBQUMsZUFBZSxHQUFHLElBQUksQ0FBQztRQUM1QixJQUFJLENBQUMsY0FBYzthQUNoQixVQUFVLEVBQUU7YUFDWixJQUFJLENBQ0gsOERBQU8sQ0FDTCxHQUFHLEVBQUUsQ0FBQyxJQUFJLENBQUMsY0FBYyxDQUFDLFVBQVUsRUFBRSxFQUN0QyxDQUFDLE9BQWdCLEVBQUUsVUFBc0IsRUFBRSxFQUFFO1lBQzNDLElBQUksQ0FBQyxPQUFPLEdBQUcsT0FBTyxDQUFDO1lBQ3ZCLElBQUksQ0FBQyxPQUFPLEdBQUcsVUFBVSxDQUFDLE9BQU8sQ0FBQztZQUNsQyxJQUFJLENBQUMsZUFBZSxHQUFHLEtBQUssQ0FBQztZQUM3QixJQUFJLENBQUMsY0FBYyxDQUFDLGFBQWEsRUFBRSxDQUFDO1FBQ3RDLENBQUMsQ0FDRixDQUNGO2FBQ0EsU0FBUyxFQUFFLENBQUM7SUFDakIsQ0FBQztJQUVELGdCQUFnQixDQUFDLEdBQWU7UUFDOUIsT0FBTyxJQUFJLENBQUMsT0FBTyxJQUFJLElBQUksQ0FBQyxPQUFPLENBQUMsR0FBRyxDQUFDLENBQUM7SUFDM0MsQ0FBQztJQUVELGlDQUFpQyxDQUFDLEdBQWU7UUFDL0MsT0FBTyxJQUFJLENBQUMsT0FBTyxJQUFJLElBQUksQ0FBQyxPQUFPLENBQUMsR0FBRyxDQUFDLElBQUksSUFBSSxDQUFDLFNBQVMsQ0FBQyxJQUFJLENBQUMsT0FBTyxDQUFDLEdBQUcsQ0FBQyxDQUFDLEtBQUssSUFBSSxDQUFDO0lBQ3pGLENBQUM7O2dGQW5DVSxnQkFBZ0I7Z0dBQWhCLGdCQUFnQjtRQ1Y3QixzRUFDSTtRQUFBO1FBQUEscUVBQ0k7UUFBQTtRQUFBLDBFQUE2RDtRQUFBLDhFQUFtQjtRQUFBLDREQUFPO1FBRXZGO1FBQUEsNEVBQ0k7UUFEd0Msd0lBQVMsYUFBUyxJQUFDO1FBQzNEO1FBQUEsd0VBQStCO1FBQUM7UUFBQSwyRUFBNEM7UUFBQSxtRUFBTztRQUFBLDREQUFPO1FBQzlGO1FBQUEsNERBQVM7UUFDYjtRQUFBLDREQUFLO1FBRUw7UUFBQSx5RUFBcUM7UUFBQSx1RUFBVztRQUFBLDREQUFLO1FBRXJEO1FBQUEsK0dBQ0k7UUFVSjtRQUFBLDhHQUNJO1FBTUo7UUFBQSw4R0FBa0Y7UUFFbEY7UUFBQSw4SUFDQTtRQUVBO1FBQUEsb0tBQ0E7UUFFQTtRQUFBLDJJQUNBO1FBRUE7UUFBQSxxSkFDQTtRQUNKO1FBQUEsNERBQU07UUFDTjs7UUFoQ3FCLDJEQUFtQztRQUFuQyxxR0FBbUM7UUFXL0MsMERBQXVEO1FBQXZELHlIQUF1RDtRQU9sQywwREFBdUI7UUFBdkIscUZBQXVCO1FBRTVCLDBEQUEyRDtRQUEzRCw2SEFBMkQ7UUFHaEQsMERBQStDO1FBQS9DLGlIQUErQztRQUc1RCwwREFBNEM7UUFBNUMsOEdBQTRDO1FBR3ZDLDBEQUFpRTtRQUFqRSxtSUFBaUU7OzZGRDlCaEYsZ0JBQWdCO2NBTDVCLHVEQUFTO2VBQUM7Z0JBQ1QsUUFBUSxFQUFFLGFBQWE7Z0JBQ3ZCLFdBQVcsRUFBRSwwQkFBMEI7Z0JBQ3ZDLGVBQWUsRUFBRSxxRUFBdUIsQ0FBQyxNQUFNO2FBQ2hEIiwiZmlsZSI6Ii4vc3JjL21haW4vd2ViYXBwL2FwcC9hZG1pbi9tZXRyaWNzL21ldHJpY3MuY29tcG9uZW50LnRzLmpzIiwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IHsgQ29tcG9uZW50LCBPbkluaXQsIENoYW5nZURldGVjdGlvblN0cmF0ZWd5LCBDaGFuZ2VEZXRlY3RvclJlZiB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnO1xuaW1wb3J0IHsgZmxhdE1hcCB9IGZyb20gJ3J4anMvb3BlcmF0b3JzJztcblxuaW1wb3J0IHsgTWV0cmljc1NlcnZpY2UsIE1ldHJpY3MsIE1ldHJpY3NLZXksIFRocmVhZER1bXAsIFRocmVhZCB9IGZyb20gJy4vbWV0cmljcy5zZXJ2aWNlJztcblxuQENvbXBvbmVudCh7XG4gIHNlbGVjdG9yOiAnamhpLW1ldHJpY3MnLFxuICB0ZW1wbGF0ZVVybDogJy4vbWV0cmljcy5jb21wb25lbnQuaHRtbCcsXG4gIGNoYW5nZURldGVjdGlvbjogQ2hhbmdlRGV0ZWN0aW9uU3RyYXRlZ3kuT25QdXNoLFxufSlcbmV4cG9ydCBjbGFzcyBNZXRyaWNzQ29tcG9uZW50IGltcGxlbWVudHMgT25Jbml0IHtcbiAgbWV0cmljcz86IE1ldHJpY3M7XG4gIHRocmVhZHM/OiBUaHJlYWRbXTtcbiAgdXBkYXRpbmdNZXRyaWNzID0gdHJ1ZTtcblxuICBjb25zdHJ1Y3Rvcihwcml2YXRlIG1ldHJpY3NTZXJ2aWNlOiBNZXRyaWNzU2VydmljZSwgcHJpdmF0ZSBjaGFuZ2VEZXRlY3RvcjogQ2hhbmdlRGV0ZWN0b3JSZWYpIHt9XG5cbiAgbmdPbkluaXQoKTogdm9pZCB7XG4gICAgdGhpcy5yZWZyZXNoKCk7XG4gIH1cblxuICByZWZyZXNoKCk6IHZvaWQge1xuICAgIHRoaXMudXBkYXRpbmdNZXRyaWNzID0gdHJ1ZTtcbiAgICB0aGlzLm1ldHJpY3NTZXJ2aWNlXG4gICAgICAuZ2V0TWV0cmljcygpXG4gICAgICAucGlwZShcbiAgICAgICAgZmxhdE1hcChcbiAgICAgICAgICAoKSA9PiB0aGlzLm1ldHJpY3NTZXJ2aWNlLnRocmVhZER1bXAoKSxcbiAgICAgICAgICAobWV0cmljczogTWV0cmljcywgdGhyZWFkRHVtcDogVGhyZWFkRHVtcCkgPT4ge1xuICAgICAgICAgICAgdGhpcy5tZXRyaWNzID0gbWV0cmljcztcbiAgICAgICAgICAgIHRoaXMudGhyZWFkcyA9IHRocmVhZER1bXAudGhyZWFkcztcbiAgICAgICAgICAgIHRoaXMudXBkYXRpbmdNZXRyaWNzID0gZmFsc2U7XG4gICAgICAgICAgICB0aGlzLmNoYW5nZURldGVjdG9yLmRldGVjdENoYW5nZXMoKTtcbiAgICAgICAgICB9XG4gICAgICAgIClcbiAgICAgIClcbiAgICAgIC5zdWJzY3JpYmUoKTtcbiAgfVxuXG4gIG1ldHJpY3NLZXlFeGlzdHMoa2V5OiBNZXRyaWNzS2V5KTogYm9vbGVhbiB7XG4gICAgcmV0dXJuIHRoaXMubWV0cmljcyAmJiB0aGlzLm1ldHJpY3Nba2V5XTtcbiAgfVxuXG4gIG1ldHJpY3NLZXlFeGlzdHNBbmRPYmplY3ROb3RFbXB0eShrZXk6IE1ldHJpY3NLZXkpOiBib29sZWFuIHtcbiAgICByZXR1cm4gdGhpcy5tZXRyaWNzICYmIHRoaXMubWV0cmljc1trZXldICYmIEpTT04uc3RyaW5naWZ5KHRoaXMubWV0cmljc1trZXldKSAhPT0gJ3t9JztcbiAgfVxufVxuIiwiPGRpdj5cbiAgICA8aDI+XG4gICAgICAgIDxzcGFuIGlkPVwibWV0cmljcy1wYWdlLWhlYWRpbmdcIiBqaGlUcmFuc2xhdGU9XCJtZXRyaWNzLnRpdGxlXCI+QXBwbGljYXRpb24gTWV0cmljczwvc3Bhbj5cblxuICAgICAgICA8YnV0dG9uIGNsYXNzPVwiYnRuIGJ0bi1wcmltYXJ5IGZsb2F0LXJpZ2h0XCIgKGNsaWNrKT1cInJlZnJlc2goKVwiPlxuICAgICAgICAgICAgPGZhLWljb24gaWNvbj1cInN5bmNcIj48L2ZhLWljb24+IDxzcGFuIGpoaVRyYW5zbGF0ZT1cIm1ldHJpY3MucmVmcmVzaC5idXR0b25cIj5SZWZyZXNoPC9zcGFuPlxuICAgICAgICA8L2J1dHRvbj5cbiAgICA8L2gyPlxuXG4gICAgPGgzIGpoaVRyYW5zbGF0ZT1cIm1ldHJpY3MuanZtLnRpdGxlXCI+SlZNIE1ldHJpY3M8L2gzPlxuXG4gICAgPGRpdiBjbGFzcz1cInJvd1wiICpuZ0lmPVwibWV0cmljcyAmJiAhdXBkYXRpbmdNZXRyaWNzXCI+XG4gICAgICAgIDxqaGktanZtLW1lbW9yeSBjbGFzcz1cImNvbC1tZC00XCIgW3VwZGF0aW5nXT1cInVwZGF0aW5nTWV0cmljc1wiIFtqdm1NZW1vcnlNZXRyaWNzXT1cIm1ldHJpY3MuanZtXCI+XG4gICAgICAgIDwvamhpLWp2bS1tZW1vcnk+XG5cbiAgICAgICAgPGpoaS1qdm0tdGhyZWFkcyBjbGFzcz1cImNvbC1tZC00XCIgW3RocmVhZERhdGFdPVwidGhyZWFkc1wiPlxuICAgICAgICA8L2poaS1qdm0tdGhyZWFkcz5cblxuICAgICAgICA8amhpLW1ldHJpY3Mtc3lzdGVtIGNsYXNzPVwiY29sLW1kLTRcIiBbdXBkYXRpbmddPVwidXBkYXRpbmdNZXRyaWNzXCIgW3N5c3RlbU1ldHJpY3NdPVwibWV0cmljcy5wcm9jZXNzTWV0cmljc1wiPlxuICAgICAgICA8L2poaS1tZXRyaWNzLXN5c3RlbT5cbiAgICA8L2Rpdj5cblxuICAgIDxkaXYgKm5nSWY9XCJtZXRyaWNzICYmIG1ldHJpY3NLZXlFeGlzdHMoJ2dhcmJhZ2VDb2xsZWN0b3InKVwiPlxuICAgICAgICA8aDMgamhpVHJhbnNsYXRlPVwibWV0cmljcy5qdm0uZ2MudGl0bGVcIj5HYXJiYWdlIGNvbGxlY3RvciBzdGF0aXN0aWNzPC9oMz5cblxuICAgICAgICA8amhpLW1ldHJpY3MtZ2FyYmFnZWNvbGxlY3RvciBbdXBkYXRpbmddPVwidXBkYXRpbmdNZXRyaWNzXCIgW2dhcmJhZ2VDb2xsZWN0b3JNZXRyaWNzXT1cIm1ldHJpY3MuZ2FyYmFnZUNvbGxlY3RvclwiPlxuICAgICAgICA8L2poaS1tZXRyaWNzLWdhcmJhZ2Vjb2xsZWN0b3I+XG4gICAgPC9kaXY+XG5cbiAgICA8ZGl2IGNsYXNzPVwid2VsbCB3ZWxsLWxnXCIgKm5nSWY9XCJ1cGRhdGluZ01ldHJpY3NcIiBqaGlUcmFuc2xhdGU9XCJtZXRyaWNzLnVwZGF0aW5nXCI+VXBkYXRpbmcuLi48L2Rpdj5cblxuICAgIDxqaGktbWV0cmljcy1yZXF1ZXN0ICpuZ0lmPVwibWV0cmljcyAmJiBtZXRyaWNzS2V5RXhpc3RzKCdodHRwLnNlcnZlci5yZXF1ZXN0cycpXCIgW3VwZGF0aW5nXT1cInVwZGF0aW5nTWV0cmljc1wiIFtyZXF1ZXN0TWV0cmljc109XCJtZXRyaWNzWydodHRwLnNlcnZlci5yZXF1ZXN0cyddXCI+XG4gICAgPC9qaGktbWV0cmljcy1yZXF1ZXN0PlxuXG4gICAgPGpoaS1tZXRyaWNzLWVuZHBvaW50cy1yZXF1ZXN0cyAqbmdJZj1cIm1ldHJpY3MgJiYgbWV0cmljc0tleUV4aXN0cygnc2VydmljZXMnKVwiIFt1cGRhdGluZ109XCJ1cGRhdGluZ01ldHJpY3NcIiBbZW5kcG9pbnRzUmVxdWVzdHNNZXRyaWNzXT1cIm1ldHJpY3Muc2VydmljZXNcIj5cbiAgICA8L2poaS1tZXRyaWNzLWVuZHBvaW50cy1yZXF1ZXN0cz5cblxuICAgIDxqaGktbWV0cmljcy1jYWNoZSAqbmdJZj1cIm1ldHJpY3MgJiYgbWV0cmljc0tleUV4aXN0cygnY2FjaGUnKVwiIFt1cGRhdGluZ109XCJ1cGRhdGluZ01ldHJpY3NcIiBbY2FjaGVNZXRyaWNzXT1cIm1ldHJpY3MuY2FjaGVcIj5cbiAgICA8L2poaS1tZXRyaWNzLWNhY2hlPlxuXG4gICAgPGpoaS1tZXRyaWNzLWRhdGFzb3VyY2UgKm5nSWY9XCJtZXRyaWNzICYmIG1ldHJpY3NLZXlFeGlzdHNBbmRPYmplY3ROb3RFbXB0eSgnZGF0YWJhc2VzJylcIiBbdXBkYXRpbmddPVwidXBkYXRpbmdNZXRyaWNzXCIgW2RhdGFzb3VyY2VNZXRyaWNzXT1cIm1ldHJpY3MuZGF0YWJhc2VzXCI+XG4gICAgPC9qaGktbWV0cmljcy1kYXRhc291cmNlPlxuPC9kaXY+XG4iXSwic291cmNlUm9vdCI6IiJ9\n//# sourceURL=webpack-internal:///./src/main/webapp/app/admin/metrics/metrics.component.ts\n");

/***/ }),

/***/ "./src/main/webapp/app/admin/metrics/metrics.module.ts":
/*!*************************************************************!*\
  !*** ./src/main/webapp/app/admin/metrics/metrics.module.ts ***!
  \*************************************************************/
/*! exports provided: MetricsModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"MetricsModule\", function() { return MetricsModule; });\n/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js\");\n/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/__ivy_ngcc__/fesm5/router.js\");\n/* harmony import */ var app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! app/shared/shared.module */ \"./src/main/webapp/app/shared/shared.module.ts\");\n/* harmony import */ var _metrics_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./metrics.component */ \"./src/main/webapp/app/admin/metrics/metrics.component.ts\");\n/* harmony import */ var _metrics_route__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./metrics.route */ \"./src/main/webapp/app/admin/metrics/metrics.route.ts\");\n\n\n\n\n\n\n\nclass MetricsModule {\n}\nMetricsModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdefineNgModule\"]({ type: MetricsModule });\nMetricsModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdefineInjector\"]({ factory: function MetricsModule_Factory(t) { return new (t || MetricsModule)(); }, imports: [[app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__[\"GatewaySharedModule\"], _angular_router__WEBPACK_IMPORTED_MODULE_1__[\"RouterModule\"].forChild([_metrics_route__WEBPACK_IMPORTED_MODULE_4__[\"metricsRoute\"]])]] });\n(function () { (typeof ngJitMode === \"undefined\" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵsetNgModuleScope\"](MetricsModule, { declarations: [_metrics_component__WEBPACK_IMPORTED_MODULE_3__[\"MetricsComponent\"]], imports: [app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__[\"GatewaySharedModule\"], _angular_router__WEBPACK_IMPORTED_MODULE_1__[\"RouterModule\"]] }); })();\n/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵsetClassMetadata\"](MetricsModule, [{\n        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"NgModule\"],\n        args: [{\n                imports: [app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__[\"GatewaySharedModule\"], _angular_router__WEBPACK_IMPORTED_MODULE_1__[\"RouterModule\"].forChild([_metrics_route__WEBPACK_IMPORTED_MODULE_4__[\"metricsRoute\"]])],\n                declarations: [_metrics_component__WEBPACK_IMPORTED_MODULE_3__[\"MetricsComponent\"]],\n            }]\n    }], null, null); })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL21ldHJpY3MvbWV0cmljcy5tb2R1bGUudHM/ODM3MyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUF5QztBQUNNO0FBQ2dCO0FBRVI7QUFFUjs7O0FBTXhDLE1BQU0sYUFBYTs7NEZBQWIsYUFBYTtvSkFBYixhQUFhLGtCQUhmLENBQUMsNEVBQW1CLEVBQUUsNERBQVksQ0FBQyxRQUFRLENBQUMsQ0FBQywyREFBWSxDQUFDLENBQUMsQ0FBQzttSUFHMUQsYUFBYSxtQkFGVCxtRUFBZ0IsYUFEckIsNEVBQW1CLEVBQUU7NkZBR3BCLGFBQWE7Y0FKekIsc0RBQVE7ZUFBQztnQkFDUixPQUFPLEVBQUUsQ0FBQyw0RUFBbUIsRUFBRSw0REFBWSxDQUFDLFFBQVEsQ0FBQyxDQUFDLDJEQUFZLENBQUMsQ0FBQyxDQUFDO2dCQUNyRSxZQUFZLEVBQUUsQ0FBQyxtRUFBZ0IsQ0FBQzthQUNqQyIsImZpbGUiOiIuL3NyYy9tYWluL3dlYmFwcC9hcHAvYWRtaW4vbWV0cmljcy9tZXRyaWNzLm1vZHVsZS50cy5qcyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IE5nTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSc7XG5pbXBvcnQgeyBSb3V0ZXJNb2R1bGUgfSBmcm9tICdAYW5ndWxhci9yb3V0ZXInO1xuaW1wb3J0IHsgR2F0ZXdheVNoYXJlZE1vZHVsZSB9IGZyb20gJ2FwcC9zaGFyZWQvc2hhcmVkLm1vZHVsZSc7XG5cbmltcG9ydCB7IE1ldHJpY3NDb21wb25lbnQgfSBmcm9tICcuL21ldHJpY3MuY29tcG9uZW50JztcblxuaW1wb3J0IHsgbWV0cmljc1JvdXRlIH0gZnJvbSAnLi9tZXRyaWNzLnJvdXRlJztcblxuQE5nTW9kdWxlKHtcbiAgaW1wb3J0czogW0dhdGV3YXlTaGFyZWRNb2R1bGUsIFJvdXRlck1vZHVsZS5mb3JDaGlsZChbbWV0cmljc1JvdXRlXSldLFxuICBkZWNsYXJhdGlvbnM6IFtNZXRyaWNzQ29tcG9uZW50XSxcbn0pXG5leHBvcnQgY2xhc3MgTWV0cmljc01vZHVsZSB7fVxuIl0sInNvdXJjZVJvb3QiOiIifQ==\n//# sourceURL=webpack-internal:///./src/main/webapp/app/admin/metrics/metrics.module.ts\n");

/***/ }),

/***/ "./src/main/webapp/app/admin/metrics/metrics.route.ts":
/*!************************************************************!*\
  !*** ./src/main/webapp/app/admin/metrics/metrics.route.ts ***!
  \************************************************************/
/*! exports provided: metricsRoute */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"metricsRoute\", function() { return metricsRoute; });\n/* harmony import */ var _metrics_component__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./metrics.component */ \"./src/main/webapp/app/admin/metrics/metrics.component.ts\");\n\nconst metricsRoute = {\n    path: '',\n    component: _metrics_component__WEBPACK_IMPORTED_MODULE_0__[\"MetricsComponent\"],\n    data: {\n        pageTitle: 'metrics.title',\n    },\n};\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL21ldHJpY3MvbWV0cmljcy5yb3V0ZS50cz8yYzk1Il0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUVBO0FBQUE7QUFBQTtBQUF1RDtBQUVoRCxNQUFNLFlBQVksR0FBVTtJQUNqQyxJQUFJLEVBQUUsRUFBRTtJQUNSLFNBQVMsRUFBRSxtRUFBZ0I7SUFDM0IsSUFBSSxFQUFFO1FBQ0osU0FBUyxFQUFFLGVBQWU7S0FDM0I7Q0FDRixDQUFDIiwiZmlsZSI6Ii4vc3JjL21haW4vd2ViYXBwL2FwcC9hZG1pbi9tZXRyaWNzL21ldHJpY3Mucm91dGUudHMuanMiLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBSb3V0ZSB9IGZyb20gJ0Bhbmd1bGFyL3JvdXRlcic7XG5cbmltcG9ydCB7IE1ldHJpY3NDb21wb25lbnQgfSBmcm9tICcuL21ldHJpY3MuY29tcG9uZW50JztcblxuZXhwb3J0IGNvbnN0IG1ldHJpY3NSb3V0ZTogUm91dGUgPSB7XG4gIHBhdGg6ICcnLFxuICBjb21wb25lbnQ6IE1ldHJpY3NDb21wb25lbnQsXG4gIGRhdGE6IHtcbiAgICBwYWdlVGl0bGU6ICdtZXRyaWNzLnRpdGxlJyxcbiAgfSxcbn07XG4iXSwic291cmNlUm9vdCI6IiJ9\n//# sourceURL=webpack-internal:///./src/main/webapp/app/admin/metrics/metrics.route.ts\n");

/***/ }),

/***/ "./src/main/webapp/app/admin/metrics/metrics.service.ts":
/*!**************************************************************!*\
  !*** ./src/main/webapp/app/admin/metrics/metrics.service.ts ***!
  \**************************************************************/
/*! exports provided: MetricsService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"MetricsService\", function() { return MetricsService; });\n/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js\");\n/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ \"./node_modules/@angular/common/__ivy_ngcc__/fesm5/http.js\");\n/* harmony import */ var app_app_constants__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! app/app.constants */ \"./src/main/webapp/app/app.constants.ts\");\n\n\n\n\n\nclass MetricsService {\n    constructor(http) {\n        this.http = http;\n    }\n    getMetrics() {\n        return this.http.get(app_app_constants__WEBPACK_IMPORTED_MODULE_2__[\"SERVER_API_URL\"] + 'management/jhimetrics');\n    }\n    threadDump() {\n        return this.http.get(app_app_constants__WEBPACK_IMPORTED_MODULE_2__[\"SERVER_API_URL\"] + 'management/threaddump');\n    }\n}\nMetricsService.ɵfac = function MetricsService_Factory(t) { return new (t || MetricsService)(_angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵinject\"](_angular_common_http__WEBPACK_IMPORTED_MODULE_1__[\"HttpClient\"])); };\nMetricsService.ɵprov = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdefineInjectable\"]({ token: MetricsService, factory: MetricsService.ɵfac, providedIn: 'root' });\n/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵsetClassMetadata\"](MetricsService, [{\n        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"Injectable\"],\n        args: [{ providedIn: 'root' }]\n    }], function () { return [{ type: _angular_common_http__WEBPACK_IMPORTED_MODULE_1__[\"HttpClient\"] }]; }, null); })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL21ldHJpY3MvbWV0cmljcy5zZXJ2aWNlLnRzPzBmNTAiXSwibmFtZXMiOltdLCJtYXBwaW5ncyI6IkFBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUEyQztBQUNPO0FBR0M7OztBQVE1QyxNQUFNLGNBQWM7SUFDekIsWUFBb0IsSUFBZ0I7UUFBaEIsU0FBSSxHQUFKLElBQUksQ0FBWTtJQUFHLENBQUM7SUFFeEMsVUFBVTtRQUNSLE9BQU8sSUFBSSxDQUFDLElBQUksQ0FBQyxHQUFHLENBQVUsZ0VBQWMsR0FBRyx1QkFBdUIsQ0FBQyxDQUFDO0lBQzFFLENBQUM7SUFFRCxVQUFVO1FBQ1IsT0FBTyxJQUFJLENBQUMsSUFBSSxDQUFDLEdBQUcsQ0FBYSxnRUFBYyxHQUFHLHVCQUF1QixDQUFDLENBQUM7SUFDN0UsQ0FBQzs7NEVBVFUsY0FBYztpR0FBZCxjQUFjLFdBQWQsY0FBYyxtQkFERCxNQUFNOzZGQUNuQixjQUFjO2NBRDFCLHdEQUFVO2VBQUMsRUFBRSxVQUFVLEVBQUUsTUFBTSxFQUFFIiwiZmlsZSI6Ii4vc3JjL21haW4vd2ViYXBwL2FwcC9hZG1pbi9tZXRyaWNzL21ldHJpY3Muc2VydmljZS50cy5qcyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IEluamVjdGFibGUgfSBmcm9tICdAYW5ndWxhci9jb3JlJztcbmltcG9ydCB7IEh0dHBDbGllbnQgfSBmcm9tICdAYW5ndWxhci9jb21tb24vaHR0cCc7XG5pbXBvcnQgeyBPYnNlcnZhYmxlIH0gZnJvbSAncnhqcyc7XG5cbmltcG9ydCB7IFNFUlZFUl9BUElfVVJMIH0gZnJvbSAnYXBwL2FwcC5jb25zdGFudHMnO1xuXG5leHBvcnQgdHlwZSBNZXRyaWNzS2V5ID0gJ2p2bScgfCAnaHR0cC5zZXJ2ZXIucmVxdWVzdHMnIHwgJ2NhY2hlJyB8ICdzZXJ2aWNlcycgfCAnZGF0YWJhc2VzJyB8ICdnYXJiYWdlQ29sbGVjdG9yJyB8ICdwcm9jZXNzTWV0cmljcyc7XG5leHBvcnQgdHlwZSBNZXRyaWNzID0geyBba2V5IGluIE1ldHJpY3NLZXldOiBhbnkgfTtcbmV4cG9ydCB0eXBlIFRocmVhZCA9IGFueTtcbmV4cG9ydCB0eXBlIFRocmVhZER1bXAgPSB7IHRocmVhZHM6IFRocmVhZFtdIH07XG5cbkBJbmplY3RhYmxlKHsgcHJvdmlkZWRJbjogJ3Jvb3QnIH0pXG5leHBvcnQgY2xhc3MgTWV0cmljc1NlcnZpY2Uge1xuICBjb25zdHJ1Y3Rvcihwcml2YXRlIGh0dHA6IEh0dHBDbGllbnQpIHt9XG5cbiAgZ2V0TWV0cmljcygpOiBPYnNlcnZhYmxlPE1ldHJpY3M+IHtcbiAgICByZXR1cm4gdGhpcy5odHRwLmdldDxNZXRyaWNzPihTRVJWRVJfQVBJX1VSTCArICdtYW5hZ2VtZW50L2poaW1ldHJpY3MnKTtcbiAgfVxuXG4gIHRocmVhZER1bXAoKTogT2JzZXJ2YWJsZTxUaHJlYWREdW1wPiB7XG4gICAgcmV0dXJuIHRoaXMuaHR0cC5nZXQ8VGhyZWFkRHVtcD4oU0VSVkVSX0FQSV9VUkwgKyAnbWFuYWdlbWVudC90aHJlYWRkdW1wJyk7XG4gIH1cbn1cbiJdLCJzb3VyY2VSb290IjoiIn0=\n//# sourceURL=webpack-internal:///./src/main/webapp/app/admin/metrics/metrics.service.ts\n");

/***/ })

}]);