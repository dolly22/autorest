﻿// This file is used by Code Analysis to maintain SuppressMessage 
// attributes that are applied to this project.
// Project-level suppressions either have no target or are given 
// a specific target and scoped to a namespace, type, member, etc.
//
// To add a suppression to this file, right-click the message in the 
// Code Analysis results, point to "Suppress Message", and click 
// "In Suppression File".
// You do not need to add suppressions to this file manually.

[assembly: System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "CA1020:AvoidNamespacesWithFewTypes", 
    Scope = "namespace", Target = "Microsoft.Rest.Generator.Azure.NodeJS.Templates", Justification="Parallelism with other generators.")]
[assembly: System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Globalization", 
    "CA1303:Do not pass literals as localized parameters", 
    MessageId = "Microsoft.Rest.Generator.Utilities.IndentedStringBuilder.AppendLine(System.String)", Scope = "member", 
    Target = "Microsoft.Rest.Generator.Azure.NodeJS.AzureMethodTemplateModel.#BuildUrl(System.String)", 
    Justification="The literal string is generated code, there are no globalization concerns")]
[assembly: System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "CA1020:AvoidNamespacesWithFewTypes", Scope = "namespace", 
    Target = "Microsoft.Rest.Generator.Azure.NodeJS", Justification ="Parallelism with other generators")]
[assembly: System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Globalization", "CA1303:Do not pass literals as localized parameters", MessageId = "Microsoft.Rest.Generator.Utilities.IndentedStringBuilder.AppendLine(System.String)", Scope = "member", Target = "Microsoft.Rest.Generator.Azure.NodeJS.AzureMethodTemplateModel.#SetDefaultHeaders",
    Justification = "Required for Azure customization.")]
