//
//  ViewModel.swift
//  iosApp
//
//  Created by MAC on 25/02/2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import shared


import Foundation

class ViewModel: ObservableObject {
    @Published var text = "Loading..."
    init() {
        // Data will be loaded here
        Greeting().greet { greeting, error in
                    DispatchQueue.main.async {
                        if let greeting = greeting {
                            self.text = greeting
                        } else {
                            self.text = error?.localizedDescription ?? "error"
                        }
                    }
                }
    }
}

