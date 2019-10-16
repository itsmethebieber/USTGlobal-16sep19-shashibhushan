import { Directive, ElementRef, HostBinding, HostListener } from '@angular/core';

@Directive({
    // tslint:disable-next-line: directive-selector
    selector : '[custDir]',
})



export class CustomDirective {
    constructor(public el: ElementRef) {
        this.el.nativeElement.style.backgroundColor = 'green';
        this.el.nativeElement.style.color = 'white';
    }

    @HostBinding('style.color') colrName = 'blue';

    // @HostBinding('style.back') color = 35;

    @HostListener('mouseenter') mouseEnterEvent() {
        this.el.nativeElement.style.color = 'yellow';
        this.el.nativeElement.style.cursor = 'pointer';
    }

    @HostListener('mouseleave') mouseLeaveEevt() {
        this.el.nativeElement.style.color = 'black';
    }
}



