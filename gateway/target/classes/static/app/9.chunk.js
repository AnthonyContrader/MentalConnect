(window["webpackJsonp"] = window["webpackJsonp"] || []).push([[9],{

/***/ "./src/main/webapp/app/admin/tracker/tracker.component.ts":
/*!****************************************************************!*\
  !*** ./src/main/webapp/app/admin/tracker/tracker.component.ts ***!
  \****************************************************************/
/*! exports provided: TrackerComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"TrackerComponent\", function() { return TrackerComponent; });\n/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js\");\n/* harmony import */ var app_core_tracker_tracker_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! app/core/tracker/tracker.service */ \"./src/main/webapp/app/core/tracker/tracker.service.ts\");\n/* harmony import */ var ng_jhipster__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ng-jhipster */ \"./node_modules/ng-jhipster/__ivy_ngcc__/fesm5/ng-jhipster.js\");\n/* harmony import */ var _angular_common__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/common */ \"./node_modules/@angular/common/__ivy_ngcc__/fesm5/common.js\");\n\n\n\n\n\n\nfunction TrackerComponent_tr_31_Template(rf, ctx) { if (rf & 1) {\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"tr\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n                    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](2, \"td\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](3);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](4, \"\\n                    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](5, \"td\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](6);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](7, \"\\n                    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](8, \"td\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](9);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](10, \"\\n                    \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](11, \"td\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](12);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵpipe\"](13, \"date\");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](14, \"\\n                \");\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n} if (rf & 2) {\n    const activity_r1 = ctx.$implicit;\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](3);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtextInterpolate\"](activity_r1.userLogin);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](3);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtextInterpolate\"](activity_r1.ipAddress);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](3);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtextInterpolate\"](activity_r1.page);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](3);\n    _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtextInterpolate\"](_angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵpipeBind2\"](13, 4, activity_r1.time, \"yyyy-MM-dd HH:mm:ss\"));\n} }\nclass TrackerComponent {\n    constructor(trackerService) {\n        this.trackerService = trackerService;\n        this.activities = [];\n    }\n    showActivity(activity) {\n        let existingActivity = false;\n        for (let index = 0; index < this.activities.length; index++) {\n            if (this.activities[index].sessionId === activity.sessionId) {\n                existingActivity = true;\n                if (activity.page === 'logout') {\n                    this.activities.splice(index, 1);\n                }\n                else {\n                    this.activities[index] = activity;\n                }\n            }\n        }\n        if (!existingActivity && activity.page !== 'logout') {\n            this.activities.push(activity);\n        }\n    }\n    ngOnInit() {\n        this.trackerService.subscribe();\n        this.subscription = this.trackerService.receive().subscribe((activity) => {\n            this.showActivity(activity);\n        });\n    }\n    ngOnDestroy() {\n        this.trackerService.unsubscribe();\n        if (this.subscription) {\n            this.subscription.unsubscribe();\n        }\n    }\n}\nTrackerComponent.ɵfac = function TrackerComponent_Factory(t) { return new (t || TrackerComponent)(_angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdirectiveInject\"](app_core_tracker_tracker_service__WEBPACK_IMPORTED_MODULE_1__[\"TrackerService\"])); };\nTrackerComponent.ɵcmp = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdefineComponent\"]({ type: TrackerComponent, selectors: [[\"jhi-tracker\"]], decls: 37, vars: 1, consts: [[\"id\", \"tracker-page-heading\", \"jhiTranslate\", \"tracker.title\"], [1, \"table-responsive\"], [\"aria-describedby\", \"tracker-page-heading\", 1, \"table\", \"table-striped\"], [\"scope\", \"col\", \"jhiTranslate\", \"tracker.table.userlogin\"], [\"scope\", \"col\", \"jhiTranslate\", \"tracker.table.ipaddress\"], [\"scope\", \"col\", \"jhiTranslate\", \"tracker.table.page\"], [\"scope\", \"col\", \"jhiTranslate\", \"tracker.table.time\"], [\"scope\", \"col\"], [4, \"ngFor\", \"ngForOf\"]], template: function TrackerComponent_Template(rf, ctx) { if (rf & 1) {\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](0, \"div\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](1, \"\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](2, \"h2\", 0);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](3, \"Real-time user activities\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](4, \"\\n\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](5, \"div\", 1);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](6, \"\\n        \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](7, \"table\", 2);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](8, \"\\n            \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](9, \"thead\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](10, \"\\n                \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](11, \"tr\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](12, \"\\n                    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](13, \"th\", 3);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](14, \"User\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](15, \"\\n                    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](16, \"th\", 4);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](17, \"IP Address\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](18, \"\\n                    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](19, \"th\", 5);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](20, \"Current page\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](21, \"\\n                    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](22, \"th\", 6);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](23, \"Time\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](24, \"\\n                    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelement\"](25, \"th\", 7);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](26, \"\\n                \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](27, \"\\n            \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](28, \"\\n            \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementStart\"](29, \"tbody\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](30, \"\\n                \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtemplate\"](31, TrackerComponent_tr_31_Template, 15, 7, \"tr\", 8);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](32, \"\\n            \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](33, \"\\n        \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](34, \"\\n    \");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](35, \"\\n\");\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵelementEnd\"]();\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵtext\"](36, \"\\n\");\n    } if (rf & 2) {\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵadvance\"](31);\n        _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵproperty\"](\"ngForOf\", ctx.activities);\n    } }, directives: [ng_jhipster__WEBPACK_IMPORTED_MODULE_2__[\"JhiTranslateDirective\"], _angular_common__WEBPACK_IMPORTED_MODULE_3__[\"NgForOf\"]], pipes: [_angular_common__WEBPACK_IMPORTED_MODULE_3__[\"DatePipe\"]], encapsulation: 2 });\n/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵsetClassMetadata\"](TrackerComponent, [{\n        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"Component\"],\n        args: [{\n                selector: 'jhi-tracker',\n                templateUrl: './tracker.component.html',\n            }]\n    }], function () { return [{ type: app_core_tracker_tracker_service__WEBPACK_IMPORTED_MODULE_1__[\"TrackerService\"] }]; }, null); })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL3RyYWNrZXIvdHJhY2tlci5jb21wb25lbnQudHM/Mzc3YSIsIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL3RyYWNrZXIvdHJhY2tlci5jb21wb25lbnQuaHRtbD8xNWJhIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUE2RDtBQUdLOzs7Ozs7SUNZbEQscUVBQ0k7SUFBQTtJQUFBLHFFQUFJO0lBQUEsdURBQXdCO0lBQUEsNERBQUs7SUFDakM7SUFBQSxxRUFBSTtJQUFBLHVEQUF3QjtJQUFBLDREQUFLO0lBQ2pDO0lBQUEscUVBQUk7SUFBQSx1REFBbUI7SUFBQSw0REFBSztJQUM1QjtJQUFBLHNFQUFJO0lBQUEsd0RBQWdEOztJQUFBLDREQUFLO0lBQzdEO0lBQUEsNERBQUs7OztJQUpHLDBEQUF3QjtJQUF4QixzRkFBd0I7SUFDeEIsMERBQXdCO0lBQXhCLHNGQUF3QjtJQUN4QiwwREFBbUI7SUFBbkIsaUZBQW1CO0lBQ25CLDBEQUFnRDtJQUFoRCwwS0FBZ0Q7O0FEVGpFLE1BQU0sZ0JBQWdCO0lBSTNCLFlBQW9CLGNBQThCO1FBQTlCLG1CQUFjLEdBQWQsY0FBYyxDQUFnQjtRQUhsRCxlQUFVLEdBQXNCLEVBQUUsQ0FBQztJQUdrQixDQUFDO0lBRXRELFlBQVksQ0FBQyxRQUF5QjtRQUNwQyxJQUFJLGdCQUFnQixHQUFHLEtBQUssQ0FBQztRQUU3QixLQUFLLElBQUksS0FBSyxHQUFHLENBQUMsRUFBRSxLQUFLLEdBQUcsSUFBSSxDQUFDLFVBQVUsQ0FBQyxNQUFNLEVBQUUsS0FBSyxFQUFFLEVBQUU7WUFDM0QsSUFBSSxJQUFJLENBQUMsVUFBVSxDQUFDLEtBQUssQ0FBQyxDQUFDLFNBQVMsS0FBSyxRQUFRLENBQUMsU0FBUyxFQUFFO2dCQUMzRCxnQkFBZ0IsR0FBRyxJQUFJLENBQUM7Z0JBQ3hCLElBQUksUUFBUSxDQUFDLElBQUksS0FBSyxRQUFRLEVBQUU7b0JBQzlCLElBQUksQ0FBQyxVQUFVLENBQUMsTUFBTSxDQUFDLEtBQUssRUFBRSxDQUFDLENBQUMsQ0FBQztpQkFDbEM7cUJBQU07b0JBQ0wsSUFBSSxDQUFDLFVBQVUsQ0FBQyxLQUFLLENBQUMsR0FBRyxRQUFRLENBQUM7aUJBQ25DO2FBQ0Y7U0FDRjtRQUVELElBQUksQ0FBQyxnQkFBZ0IsSUFBSSxRQUFRLENBQUMsSUFBSSxLQUFLLFFBQVEsRUFBRTtZQUNuRCxJQUFJLENBQUMsVUFBVSxDQUFDLElBQUksQ0FBQyxRQUFRLENBQUMsQ0FBQztTQUNoQztJQUNILENBQUM7SUFFRCxRQUFRO1FBQ04sSUFBSSxDQUFDLGNBQWMsQ0FBQyxTQUFTLEVBQUUsQ0FBQztRQUNoQyxJQUFJLENBQUMsWUFBWSxHQUFHLElBQUksQ0FBQyxjQUFjLENBQUMsT0FBTyxFQUFFLENBQUMsU0FBUyxDQUFDLENBQUMsUUFBeUIsRUFBRSxFQUFFO1lBQ3hGLElBQUksQ0FBQyxZQUFZLENBQUMsUUFBUSxDQUFDLENBQUM7UUFDOUIsQ0FBQyxDQUFDLENBQUM7SUFDTCxDQUFDO0lBRUQsV0FBVztRQUNULElBQUksQ0FBQyxjQUFjLENBQUMsV0FBVyxFQUFFLENBQUM7UUFDbEMsSUFBSSxJQUFJLENBQUMsWUFBWSxFQUFFO1lBQ3JCLElBQUksQ0FBQyxZQUFZLENBQUMsV0FBVyxFQUFFLENBQUM7U0FDakM7SUFDSCxDQUFDOztnRkFyQ1UsZ0JBQWdCO2dHQUFoQixnQkFBZ0I7UUNWN0Isc0VBQ0k7UUFBQTtRQUFBLHdFQUEyRDtRQUFBLG9GQUF5QjtRQUFBLDREQUFLO1FBRXpGO1FBQUEseUVBQ0k7UUFBQTtRQUFBLDJFQUNJO1FBQUE7UUFBQSx3RUFDSTtRQUFBO1FBQUEsc0VBQ0k7UUFBQTtRQUFBLHlFQUF1RDtRQUFBLGdFQUFJO1FBQUEsNERBQUs7UUFDaEU7UUFBQSx5RUFBdUQ7UUFBQSxzRUFBVTtRQUFBLDREQUFLO1FBQ3RFO1FBQUEseUVBQWtEO1FBQUEsd0VBQVk7UUFBQSw0REFBSztRQUNuRTtRQUFBLHlFQUFrRDtRQUFBLGdFQUFJO1FBQUEsNERBQUs7UUFDM0Q7UUFBQSxvRUFBcUI7UUFDekI7UUFBQSw0REFBSztRQUNUO1FBQUEsNERBQVE7UUFDUjtRQUFBLHlFQUNJO1FBQUE7UUFBQSw2R0FDSTtRQUtSO1FBQUEsNERBQVE7UUFDWjtRQUFBLDREQUFRO1FBQ1o7UUFBQSw0REFBTTtRQUNWO1FBQUEsNERBQU07UUFDTjs7UUFWb0IsMkRBQW1DO1FBQW5DLG1GQUFtQzs7NkZETDFDLGdCQUFnQjtjQUo1Qix1REFBUztlQUFDO2dCQUNULFFBQVEsRUFBRSxhQUFhO2dCQUN2QixXQUFXLEVBQUUsMEJBQTBCO2FBQ3hDIiwiZmlsZSI6Ii4vc3JjL21haW4vd2ViYXBwL2FwcC9hZG1pbi90cmFja2VyL3RyYWNrZXIuY29tcG9uZW50LnRzLmpzIiwic291cmNlc0NvbnRlbnQiOlsiaW1wb3J0IHsgQ29tcG9uZW50LCBPbkluaXQsIE9uRGVzdHJveSB9IGZyb20gJ0Bhbmd1bGFyL2NvcmUnO1xuaW1wb3J0IHsgU3Vic2NyaXB0aW9uIH0gZnJvbSAncnhqcyc7XG5cbmltcG9ydCB7IFRyYWNrZXJTZXJ2aWNlIH0gZnJvbSAnYXBwL2NvcmUvdHJhY2tlci90cmFja2VyLnNlcnZpY2UnO1xuaW1wb3J0IHsgVHJhY2tlckFjdGl2aXR5IH0gZnJvbSAnYXBwL2NvcmUvdHJhY2tlci90cmFja2VyLWFjdGl2aXR5Lm1vZGVsJztcblxuQENvbXBvbmVudCh7XG4gIHNlbGVjdG9yOiAnamhpLXRyYWNrZXInLFxuICB0ZW1wbGF0ZVVybDogJy4vdHJhY2tlci5jb21wb25lbnQuaHRtbCcsXG59KVxuZXhwb3J0IGNsYXNzIFRyYWNrZXJDb21wb25lbnQgaW1wbGVtZW50cyBPbkluaXQsIE9uRGVzdHJveSB7XG4gIGFjdGl2aXRpZXM6IFRyYWNrZXJBY3Rpdml0eVtdID0gW107XG4gIHN1YnNjcmlwdGlvbj86IFN1YnNjcmlwdGlvbjtcblxuICBjb25zdHJ1Y3Rvcihwcml2YXRlIHRyYWNrZXJTZXJ2aWNlOiBUcmFja2VyU2VydmljZSkge31cblxuICBzaG93QWN0aXZpdHkoYWN0aXZpdHk6IFRyYWNrZXJBY3Rpdml0eSk6IHZvaWQge1xuICAgIGxldCBleGlzdGluZ0FjdGl2aXR5ID0gZmFsc2U7XG5cbiAgICBmb3IgKGxldCBpbmRleCA9IDA7IGluZGV4IDwgdGhpcy5hY3Rpdml0aWVzLmxlbmd0aDsgaW5kZXgrKykge1xuICAgICAgaWYgKHRoaXMuYWN0aXZpdGllc1tpbmRleF0uc2Vzc2lvbklkID09PSBhY3Rpdml0eS5zZXNzaW9uSWQpIHtcbiAgICAgICAgZXhpc3RpbmdBY3Rpdml0eSA9IHRydWU7XG4gICAgICAgIGlmIChhY3Rpdml0eS5wYWdlID09PSAnbG9nb3V0Jykge1xuICAgICAgICAgIHRoaXMuYWN0aXZpdGllcy5zcGxpY2UoaW5kZXgsIDEpO1xuICAgICAgICB9IGVsc2Uge1xuICAgICAgICAgIHRoaXMuYWN0aXZpdGllc1tpbmRleF0gPSBhY3Rpdml0eTtcbiAgICAgICAgfVxuICAgICAgfVxuICAgIH1cblxuICAgIGlmICghZXhpc3RpbmdBY3Rpdml0eSAmJiBhY3Rpdml0eS5wYWdlICE9PSAnbG9nb3V0Jykge1xuICAgICAgdGhpcy5hY3Rpdml0aWVzLnB1c2goYWN0aXZpdHkpO1xuICAgIH1cbiAgfVxuXG4gIG5nT25Jbml0KCk6IHZvaWQge1xuICAgIHRoaXMudHJhY2tlclNlcnZpY2Uuc3Vic2NyaWJlKCk7XG4gICAgdGhpcy5zdWJzY3JpcHRpb24gPSB0aGlzLnRyYWNrZXJTZXJ2aWNlLnJlY2VpdmUoKS5zdWJzY3JpYmUoKGFjdGl2aXR5OiBUcmFja2VyQWN0aXZpdHkpID0+IHtcbiAgICAgIHRoaXMuc2hvd0FjdGl2aXR5KGFjdGl2aXR5KTtcbiAgICB9KTtcbiAgfVxuXG4gIG5nT25EZXN0cm95KCk6IHZvaWQge1xuICAgIHRoaXMudHJhY2tlclNlcnZpY2UudW5zdWJzY3JpYmUoKTtcbiAgICBpZiAodGhpcy5zdWJzY3JpcHRpb24pIHtcbiAgICAgIHRoaXMuc3Vic2NyaXB0aW9uLnVuc3Vic2NyaWJlKCk7XG4gICAgfVxuICB9XG59XG4iLCI8ZGl2PlxuICAgIDxoMiBpZD1cInRyYWNrZXItcGFnZS1oZWFkaW5nXCIgamhpVHJhbnNsYXRlPVwidHJhY2tlci50aXRsZVwiPlJlYWwtdGltZSB1c2VyIGFjdGl2aXRpZXM8L2gyPlxuXG4gICAgPGRpdiBjbGFzcz1cInRhYmxlLXJlc3BvbnNpdmVcIj5cbiAgICAgICAgPHRhYmxlIGNsYXNzPVwidGFibGUgdGFibGUtc3RyaXBlZFwiIGFyaWEtZGVzY3JpYmVkYnk9XCJ0cmFja2VyLXBhZ2UtaGVhZGluZ1wiPlxuICAgICAgICAgICAgPHRoZWFkPlxuICAgICAgICAgICAgICAgIDx0cj5cbiAgICAgICAgICAgICAgICAgICAgPHRoIHNjb3BlPVwiY29sXCIgamhpVHJhbnNsYXRlPVwidHJhY2tlci50YWJsZS51c2VybG9naW5cIj5Vc2VyPC90aD5cbiAgICAgICAgICAgICAgICAgICAgPHRoIHNjb3BlPVwiY29sXCIgamhpVHJhbnNsYXRlPVwidHJhY2tlci50YWJsZS5pcGFkZHJlc3NcIj5JUCBBZGRyZXNzPC90aD5cbiAgICAgICAgICAgICAgICAgICAgPHRoIHNjb3BlPVwiY29sXCIgamhpVHJhbnNsYXRlPVwidHJhY2tlci50YWJsZS5wYWdlXCI+Q3VycmVudCBwYWdlPC90aD5cbiAgICAgICAgICAgICAgICAgICAgPHRoIHNjb3BlPVwiY29sXCIgamhpVHJhbnNsYXRlPVwidHJhY2tlci50YWJsZS50aW1lXCI+VGltZTwvdGg+XG4gICAgICAgICAgICAgICAgICAgIDx0aCBzY29wZT1cImNvbFwiPjwvdGg+XG4gICAgICAgICAgICAgICAgPC90cj5cbiAgICAgICAgICAgIDwvdGhlYWQ+XG4gICAgICAgICAgICA8dGJvZHk+XG4gICAgICAgICAgICAgICAgPHRyICpuZ0Zvcj1cImxldCBhY3Rpdml0eSBvZiBhY3Rpdml0aWVzXCI+XG4gICAgICAgICAgICAgICAgICAgIDx0ZD57eyBhY3Rpdml0eS51c2VyTG9naW4gfX08L3RkPlxuICAgICAgICAgICAgICAgICAgICA8dGQ+e3sgYWN0aXZpdHkuaXBBZGRyZXNzIH19PC90ZD5cbiAgICAgICAgICAgICAgICAgICAgPHRkPnt7IGFjdGl2aXR5LnBhZ2UgfX08L3RkPlxuICAgICAgICAgICAgICAgICAgICA8dGQ+e3sgYWN0aXZpdHkudGltZSB8IGRhdGU6J3l5eXktTU0tZGQgSEg6bW06c3MnIH19PC90ZD5cbiAgICAgICAgICAgICAgICA8L3RyPlxuICAgICAgICAgICAgPC90Ym9keT5cbiAgICAgICAgPC90YWJsZT5cbiAgICA8L2Rpdj5cbjwvZGl2PlxuIl0sInNvdXJjZVJvb3QiOiIifQ==\n//# sourceURL=webpack-internal:///./src/main/webapp/app/admin/tracker/tracker.component.ts\n");

/***/ }),

/***/ "./src/main/webapp/app/admin/tracker/tracker.module.ts":
/*!*************************************************************!*\
  !*** ./src/main/webapp/app/admin/tracker/tracker.module.ts ***!
  \*************************************************************/
/*! exports provided: TrackerModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"TrackerModule\", function() { return TrackerModule; });\n/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ \"./node_modules/@angular/core/__ivy_ngcc__/fesm5/core.js\");\n/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/router */ \"./node_modules/@angular/router/__ivy_ngcc__/fesm5/router.js\");\n/* harmony import */ var app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! app/shared/shared.module */ \"./src/main/webapp/app/shared/shared.module.ts\");\n/* harmony import */ var _tracker_component__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./tracker.component */ \"./src/main/webapp/app/admin/tracker/tracker.component.ts\");\n/* harmony import */ var _tracker_route__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! ./tracker.route */ \"./src/main/webapp/app/admin/tracker/tracker.route.ts\");\n\n\n\n\n\n\n\nclass TrackerModule {\n}\nTrackerModule.ɵmod = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdefineNgModule\"]({ type: TrackerModule });\nTrackerModule.ɵinj = _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵdefineInjector\"]({ factory: function TrackerModule_Factory(t) { return new (t || TrackerModule)(); }, imports: [[app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__[\"GatewaySharedModule\"], _angular_router__WEBPACK_IMPORTED_MODULE_1__[\"RouterModule\"].forChild([_tracker_route__WEBPACK_IMPORTED_MODULE_4__[\"trackerRoute\"]])]] });\n(function () { (typeof ngJitMode === \"undefined\" || ngJitMode) && _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵɵsetNgModuleScope\"](TrackerModule, { declarations: [_tracker_component__WEBPACK_IMPORTED_MODULE_3__[\"TrackerComponent\"]], imports: [app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__[\"GatewaySharedModule\"], _angular_router__WEBPACK_IMPORTED_MODULE_1__[\"RouterModule\"]] }); })();\n/*@__PURE__*/ (function () { _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"ɵsetClassMetadata\"](TrackerModule, [{\n        type: _angular_core__WEBPACK_IMPORTED_MODULE_0__[\"NgModule\"],\n        args: [{\n                imports: [app_shared_shared_module__WEBPACK_IMPORTED_MODULE_2__[\"GatewaySharedModule\"], _angular_router__WEBPACK_IMPORTED_MODULE_1__[\"RouterModule\"].forChild([_tracker_route__WEBPACK_IMPORTED_MODULE_4__[\"trackerRoute\"]])],\n                declarations: [_tracker_component__WEBPACK_IMPORTED_MODULE_3__[\"TrackerComponent\"]],\n            }]\n    }], null, null); })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL3RyYWNrZXIvdHJhY2tlci5tb2R1bGUudHM/MzRmMyJdLCJuYW1lcyI6W10sIm1hcHBpbmdzIjoiQUFBQTtBQUFBO0FBQUE7QUFBQTtBQUFBO0FBQUE7QUFBQTtBQUF5QztBQUNNO0FBQ2dCO0FBRVI7QUFFUjs7O0FBTXhDLE1BQU0sYUFBYTs7NEZBQWIsYUFBYTtvSkFBYixhQUFhLGtCQUhmLENBQUMsNEVBQW1CLEVBQUUsNERBQVksQ0FBQyxRQUFRLENBQUMsQ0FBQywyREFBWSxDQUFDLENBQUMsQ0FBQzttSUFHMUQsYUFBYSxtQkFGVCxtRUFBZ0IsYUFEckIsNEVBQW1CLEVBQUU7NkZBR3BCLGFBQWE7Y0FKekIsc0RBQVE7ZUFBQztnQkFDUixPQUFPLEVBQUUsQ0FBQyw0RUFBbUIsRUFBRSw0REFBWSxDQUFDLFFBQVEsQ0FBQyxDQUFDLDJEQUFZLENBQUMsQ0FBQyxDQUFDO2dCQUNyRSxZQUFZLEVBQUUsQ0FBQyxtRUFBZ0IsQ0FBQzthQUNqQyIsImZpbGUiOiIuL3NyYy9tYWluL3dlYmFwcC9hcHAvYWRtaW4vdHJhY2tlci90cmFja2VyLm1vZHVsZS50cy5qcyIsInNvdXJjZXNDb250ZW50IjpbImltcG9ydCB7IE5nTW9kdWxlIH0gZnJvbSAnQGFuZ3VsYXIvY29yZSc7XG5pbXBvcnQgeyBSb3V0ZXJNb2R1bGUgfSBmcm9tICdAYW5ndWxhci9yb3V0ZXInO1xuaW1wb3J0IHsgR2F0ZXdheVNoYXJlZE1vZHVsZSB9IGZyb20gJ2FwcC9zaGFyZWQvc2hhcmVkLm1vZHVsZSc7XG5cbmltcG9ydCB7IFRyYWNrZXJDb21wb25lbnQgfSBmcm9tICcuL3RyYWNrZXIuY29tcG9uZW50JztcblxuaW1wb3J0IHsgdHJhY2tlclJvdXRlIH0gZnJvbSAnLi90cmFja2VyLnJvdXRlJztcblxuQE5nTW9kdWxlKHtcbiAgaW1wb3J0czogW0dhdGV3YXlTaGFyZWRNb2R1bGUsIFJvdXRlck1vZHVsZS5mb3JDaGlsZChbdHJhY2tlclJvdXRlXSldLFxuICBkZWNsYXJhdGlvbnM6IFtUcmFja2VyQ29tcG9uZW50XSxcbn0pXG5leHBvcnQgY2xhc3MgVHJhY2tlck1vZHVsZSB7fVxuIl0sInNvdXJjZVJvb3QiOiIifQ==\n//# sourceURL=webpack-internal:///./src/main/webapp/app/admin/tracker/tracker.module.ts\n");

/***/ }),

/***/ "./src/main/webapp/app/admin/tracker/tracker.route.ts":
/*!************************************************************!*\
  !*** ./src/main/webapp/app/admin/tracker/tracker.route.ts ***!
  \************************************************************/
/*! exports provided: trackerRoute */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
eval("__webpack_require__.r(__webpack_exports__);\n/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, \"trackerRoute\", function() { return trackerRoute; });\n/* harmony import */ var _tracker_component__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! ./tracker.component */ \"./src/main/webapp/app/admin/tracker/tracker.component.ts\");\n\nconst trackerRoute = {\n    path: '',\n    component: _tracker_component__WEBPACK_IMPORTED_MODULE_0__[\"TrackerComponent\"],\n    data: {\n        pageTitle: 'tracker.title',\n    },\n};\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly8vLi9zcmMvbWFpbi93ZWJhcHAvYXBwL2FkbWluL3RyYWNrZXIvdHJhY2tlci5yb3V0ZS50cz83YjYzIl0sIm5hbWVzIjpbXSwibWFwcGluZ3MiOiJBQUVBO0FBQUE7QUFBQTtBQUF1RDtBQUVoRCxNQUFNLFlBQVksR0FBVTtJQUNqQyxJQUFJLEVBQUUsRUFBRTtJQUNSLFNBQVMsRUFBRSxtRUFBZ0I7SUFDM0IsSUFBSSxFQUFFO1FBQ0osU0FBUyxFQUFFLGVBQWU7S0FDM0I7Q0FDRixDQUFDIiwiZmlsZSI6Ii4vc3JjL21haW4vd2ViYXBwL2FwcC9hZG1pbi90cmFja2VyL3RyYWNrZXIucm91dGUudHMuanMiLCJzb3VyY2VzQ29udGVudCI6WyJpbXBvcnQgeyBSb3V0ZSB9IGZyb20gJ0Bhbmd1bGFyL3JvdXRlcic7XG5cbmltcG9ydCB7IFRyYWNrZXJDb21wb25lbnQgfSBmcm9tICcuL3RyYWNrZXIuY29tcG9uZW50JztcblxuZXhwb3J0IGNvbnN0IHRyYWNrZXJSb3V0ZTogUm91dGUgPSB7XG4gIHBhdGg6ICcnLFxuICBjb21wb25lbnQ6IFRyYWNrZXJDb21wb25lbnQsXG4gIGRhdGE6IHtcbiAgICBwYWdlVGl0bGU6ICd0cmFja2VyLnRpdGxlJyxcbiAgfSxcbn07XG4iXSwic291cmNlUm9vdCI6IiJ9\n//# sourceURL=webpack-internal:///./src/main/webapp/app/admin/tracker/tracker.route.ts\n");

/***/ })

}]);