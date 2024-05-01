//
//  ExampleView.swift
//  iosApp
//
//  Created by MAC on 25/02/2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct ExampleView: View {
    @StateObject var viewModel: ViewModel = ViewModel()
    var body: some View {
        Text(viewModel.text)
    }
}

struct ExampleView_Previews: PreviewProvider {
    static var previews: some View {
        ExampleView()
    }
}

