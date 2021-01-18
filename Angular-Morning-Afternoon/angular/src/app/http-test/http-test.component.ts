import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpServicesService } from '../services/http-services.service';

export class datamodel {
  userId: string | undefined;
  id: string | undefined;
  title: string | undefined;
  body: string | undefined;
}
@Component({
  selector: 'app-http-test',
  templateUrl: './http-test.component.html',
  styleUrls: ['./http-test.component.css']
})
export class HttpTestComponent implements OnInit {

  webData : datamodel[] | undefined;
  loading: boolean = false;
  errorMessage: any;
  
  constructor(private datapull: HttpServicesService) { }
  ngOnInit(): void {
    
  }

  getData() {
    this.loading = true;
    this.errorMessage = "";
    this.datapull.getData()
      .subscribe(
        (response) => {                          
          console.log('response received')
          this.webData = response; 
        },
        (error) => {                              
          console.error('Request failed with error')
          this.errorMessage = error;
          this.loading = false;
        },
        () => {                                   
          console.error('Request completed')      
          this.loading = false; 
        })
  }

}
